public class Main {
    public static void main(String[] args){
        Ogrenci ogrenciMeyra=new Ogrenci("Meyra","Maden","yazilim","of",427655,2022,3);
        System.out.println("ogrencinin adi: "+ogrenciMeyra.getAd());
        System.out.println("ogrencinin soyadi: "+ogrenciMeyra.getSoyad());
        System.out.println("ogrencinin numarasi:"+ogrenciMeyra.getNumara());

        Ogrenci ogrenci1 = new Ogrenci("Furkan", "Yılmaz", "yazilim", "of teknoloji",1756834, 2022, 1);
        Ogrenci ogrenci2= new Ogrenci("Burak","Er","yazilim","of teknoloji",511598,2022,1);
        Ogrenci ogrenci3= new Ogrenci("Defne","Yılmaz","yazilim","of teknoloji",298138,2022,1);
        
        Akademisyen akademisyen1=new Akademisyen("ad1","soyad1");
        Akademisyen akademisyen2=new Akademisyen("ad2","soyad2");

        
        BilgiPaketi bilgiPaketi = new BilgiPaketi();

        TemelDers ders1 = new TemelDers("Matematik", "101", "Güz", false, akademisyen1, 2);
        UygulamaliDers lab1 = new UygulamaliDers("YTM", "301", "Güz", false, akademisyen2, 3);

        bilgiPaketi.dersEkle(ders1);
        bilgiPaketi.dersEkle(lab1);

        ders1.derseYazilim(ogrenci1);
        ders1.derseYazilim(ogrenci2);
        ders1.derseYazilim(ogrenci3);
        lab1.derseYazilim(ogrenci1);
        lab1.derseYazilim(ogrenci3);
        
        ders1.listeyiYazdir();
        lab1.listeyiYazdir();

        bilgiPaketi.transkriptSorgula(ogrenci1);
        bilgiPaketi.transkriptSorgula(ogrenci2);
        
    }
}
