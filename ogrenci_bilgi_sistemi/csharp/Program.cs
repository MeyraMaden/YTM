using System;

namespace YTM1
{
   
       using System;

class Program
    {
        static void Main(string[] args)
        {
            Ogrenci ogrenciMeyra = new Ogrenci("Meyra", "Maden", "yazilim", "of", 427655, 2022, 3);
            Console.WriteLine("Öğrencinin adı: " + ogrenciMeyra.Ad);
            Console.WriteLine("Öğrencinin soyadı: " + ogrenciMeyra.Soyad);
            Console.WriteLine("Öğrencinin numarası: " + ogrenciMeyra.Numara);

            Ogrenci ogrenci1 = new Ogrenci("Furkan", "Yilmaz", "yazilim", "of teknoloji", 1756834, 2022, 1);
            Ogrenci ogrenci2 = new Ogrenci("Burak", "Er", "yazilim", "of teknoloji", 511598, 2022, 1);
            Ogrenci ogrenci3 = new Ogrenci("Defne", "Yilmaz", "yazilim", "of teknoloji", 298138, 2022, 1);

            Akademisyen akademisyen1 = new Akademisyen("ad1", "soyad1");
            Akademisyen akademisyen2 = new Akademisyen("ad2", "soyad2");

            BilgiPaketi bilgiPaketi = new BilgiPaketi();

            TemelDers ders1 = new TemelDers("Matematik", "101", "Güz", false, akademisyen1, 2);
            UygulamaDersi lab1 = new UygulamaDersi("YTM", "301", "Güz", false, akademisyen2, 3);

            bilgiPaketi.DersEkle(ders1);
            bilgiPaketi.DersEkle(lab1);

            ders1.DerseYazilim(ogrenci1);
            ders1.DerseYazilim(ogrenci2);
            ders1.DerseYazilim(ogrenci3);
            lab1.DerseYazilim(ogrenci1);
            lab1.DerseYazilim(ogrenci3);

            ders1.ListeyiYazdir();
            lab1.ListeyiYazdir();

            bilgiPaketi.TranskriptSorgula(ogrenci1);
            bilgiPaketi.TranskriptSorgula(ogrenci2);

          /*  
            Console.WriteLine("Çıkışı görmek için bir tuşa basın...");
            Console.ReadKey();
          */
          // cikti hatasi verirse yorum satirini ac
          
        }
    }

}

