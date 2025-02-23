using System;

namespace Eticarett1_
{
    using System;

    public class Program
    {
        public static void Main(string[] args)
        {
            Kullanici kullanici = new Kullanici();
            kullanici.SetIsim("Sefa Aras");
            kullanici.SetMail("sefaaras@ktu.edu.tr");

            Adres adres = new Adres();
            adres.Ulke = "Turkiye";
            adres.Il = "Trabzon";
            adres.Ilce = "Of";
            kullanici.AdresGuncelle(adres);

            Console.WriteLine(kullanici.ToString());

            adres.PostKodu = 61000;
            kullanici.AdresGuncelle(adres);

            Console.WriteLine(kullanici.ToString());
        }
    }

}
