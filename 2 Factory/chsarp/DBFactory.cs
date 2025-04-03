using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory_csharp
{
    public class DBFactory
    {
        public const int MYSQL = 1;
        public const int ORACLE = 2;
        public const int MSSQL = 3;

        public IDB GetDB(int type)
        {
            if (type == MYSQL)
            {
                return new MYSQL();
            }
            else if (type == ORACLE)
            {
                return new ORACLE();
            }
            else if (type == MSSQL)
            {
                return new MSSQL();
            }
            else
            {
                return null;
            }
        }
    }
}
