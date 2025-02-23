using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eticarett1_
{
    public class Adres
    {
        private string ulke;
        private string il;
        private string ilce;
        private int postKodu;

        public string Ulke
        {
            get { return ulke; }
            set { ulke = value; }
        }

        public string Il
        {
            get { return il; }
            set { il = value; }
        }

        public string Ilce
        {
            get { return ilce; }
            set { ilce = value; }
        }

        public int PostKodu
        {
            get { return postKodu; }
            set { postKodu = value; }
        }

        public override string ToString()
        {
            return Ulke + " " + Il + " " + Ilce + " " + PostKodu;
        }
    }

}
