public class App {
    public static void main(String[] args) throws Exception {
        Kullanici ali=new StandartKullanici();
        Kullanici veli=new PremiumKullanici();

        Urun telefon=new Urun("telefon", 3000);
        Urun bilgisayar=new Urun("bilgisayar", 5000);

        ali.addUrun(telefon);
        ali.addUrun(bilgisayar);

        veli.addUrun(telefon);
        veli.addUrun(bilgisayar);

        Siparis.odemeYap(ali);
        Siparis.odemeYap(veli);
    }
    
}
