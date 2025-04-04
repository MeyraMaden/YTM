using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory_csharp
{
    public class Main
    {
        public static void main()
        {
            DBFactory dbFactory = new DBFactory();

            IDB mysql = dbFactory.GetDB(DBFactory.MYSQL);
            IDB oracle = dbFactory.GetDB(DBFactory.ORACLE);
            IDB mssql = dbFactory.GetDB(3);

            mysql.SelectData();
            mysql.InsertData();

            oracle.SelectData();
            oracle.InsertData();

            mssql.SelectData();
            mssql.InsertData();
        }
    }
}
