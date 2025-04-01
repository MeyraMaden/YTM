public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici=new Kullanici();
        kullanici.setIsım("sefa aras");
        kullanici.setMail("sefa.aras@ktu.edu.tr");

        Adres adres =new Adres();
        adres.setUlke("Turkiye");
        adres.setIl("Trabzon");
        adres.setIlce("of");

        kullanici.adresGuncelle(adres);

        System.out.println(kullanici.toString());

        adres.setPostKodu(61000);
        kullanici.adresGuncelle(adres);

        System.out.println(kullanici.toString());
       

        
    }
}
