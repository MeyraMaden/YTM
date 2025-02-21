from Akademisyen import Akademisyen
from BilgiPaketi import BilgiPaketi
from Ogrenci import Ogrenci
from UygulamaDersi import UygulamaDersi
from TemelDers import TemelDers



def main():
    ogrenci_meyra = Ogrenci("Meyra", "Maden", "yazilim", "of", 427655, 2022, 3)
    print(f"Öğrencinin adı: {ogrenci_meyra.get_ad()}")
    print(f"Öğrencinin soyadı: {ogrenci_meyra.get_soyad()}")
    print(f"Öğrencinin numarası: {ogrenci_meyra.get_numara()}")

    ogrenci1 = Ogrenci("Furkan", "Yılmaz", "yazilim", "of teknoloji", 1756834, 2022, 1)
    ogrenci2 = Ogrenci("Burak", "Er", "yazilim", "of teknoloji", 511598, 2022, 1)
    ogrenci3 = Ogrenci("Defne", "Yılmaz", "yazilim", "of teknoloji", 298138, 2022, 1)

    akademisyen1 = Akademisyen("ad1", "soyad1")
    akademisyen2 = Akademisyen("ad2", "soyad2")

    bilgi_paketi = BilgiPaketi()

    ders1 = TemelDers("Matematik", "101", "Güz", False, akademisyen1, 2)
    lab1 = UygulamaDersi("YTM", "301", "Güz", False, akademisyen2, 3)

    bilgi_paketi.ders_ekle(ders1)
    bilgi_paketi.ders_ekle(lab1)

    ders1.derse_yazilim(ogrenci1)
    ders1.derse_yazilim(ogrenci2)
    ders1.derse_yazilim(ogrenci3)
    lab1.derse_yazilim(ogrenci1)
    lab1.derse_yazilim(ogrenci3)

    ders1.listeyi_yazdir()
    lab1.listeyi_yazdir()

    bilgi_paketi.transkript_sorgula(ogrenci1)
    bilgi_paketi.transkript_sorgula(ogrenci2)


if __name__ == "__main__":
   main()
