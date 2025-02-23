using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eticarett1_
{
    public class Kullanici
    {
        private string isim;
        private string mail;
        private Adres adres;

        public void SetIsim(string isim)
        {
            this.isim = isim;
        }

        public string GetIsim()
        {
            return isim;
        }

        public string GetMail()
        {
            return mail;
        }

        public void SetMail(string mail)
        {
            this.mail = mail;
        }

        public void AdresGuncelle(Adres adres)
        {
            this.adres = adres;
        }

        public string GetAdres()
        {
            return adres.ToString();
        }

        public override string ToString()
        {
            return GetIsim() + " " + GetMail() + " " + GetAdres();
        }

        public void GirisYap(string mail, string sifre)
        {
            System.Console.WriteLine("Giriş yapıldı.");
        }
    }

}
