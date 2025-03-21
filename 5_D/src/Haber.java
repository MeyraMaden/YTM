import java.util.ArrayList;

public class Haber {
    public ArrayList<Iletisim> iletisimListesi;
    public Mail mail;
    public Bildirim bildirim;

    public Haber(){
        iletisimListesi=new ArrayList<>();
        mail=new Mail();
        bildirim=new Bildirim();
        
        iletisimListesi.add(mail);
        iletisimListesi.add(bildirim);
    }

    public void bilgilendir(Kullanici kullanici, String mesaj){
        for (Iletisim iletisim: iletisimListesi){
            iletisim.bilgiGonder(kullanici,mesaj);
        }
    }
}
