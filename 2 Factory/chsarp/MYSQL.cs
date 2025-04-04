using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory_csharp
{
    public class MYSQL : IDB
    {
        public void SelectData()
        {
            Console.WriteLine("MYSQL veritabanından veri okundu.");
        }

        public void InsertData()
        {
            Console.WriteLine("MYSQL veritabanına veri yazıldı.");
        }
    }
}
