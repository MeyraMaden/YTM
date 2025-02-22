public class Kullanici{
    private String isim,mail;
    private Adres adres;


/*
    public void adresGuncelle(Adres adres){
        this.adres.setIl(adres.getIl());
        this.adres.setIlce(adres.getIlce());
        this.adres.setUlke(adres.getUlke());
        this.adres.setPostKodu(adres.getPostKodu());
        
        //this.adres=adres;
    }
*/


    public void setIsım(String isim){
        this.isim=isim;
    }

    public void setMail(String mail){
        this.mail=mail;
    }
    
    public String getIsim(){
        return isim;
    }
    public String getMail(){
        return mail;
    }


    
    public void adresGuncelle(Adres adres) {
        this.adres = adres;
    }

    public String getAdres() {
        return adres.toString();
    }

    @Override
    public String toString() {
        return getIsim() + " " + getMail() + " " + getAdres();
    }
    public void girisYap(String mail, String sifre) {
        System.out.println("Giriş yapıldı.");
    }

}