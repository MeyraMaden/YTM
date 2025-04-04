using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory_csharp
{
    public class ORACLE : IDB
    {
        public void SelectData()
        {
            Console.WriteLine("ORACLE veritabanından veri okundu.");
        }

        public void InsertData()
        {
            Console.WriteLine("ORACLE veritabanına veri yazıldı.");
        }
    }
}
