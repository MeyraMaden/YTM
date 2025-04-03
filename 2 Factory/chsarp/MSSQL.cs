using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory_csharp
{
    public class MSSQL : IDB
    {
        public void SelectData()
        {
            Console.WriteLine("MSSQL veritabanından veri okundu.");
        }


        public void InsertData()
        {
            Console.WriteLine("MSSQL veritabanına veri yazıldı.");
        }
    }
}
