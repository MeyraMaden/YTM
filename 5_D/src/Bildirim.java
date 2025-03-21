public class Bildirim implements Iletisim {
    
    
    public void bildirimGoster(String IP,String mesaj){
        System.out.println(IP+" adresine "+mesaj+" gonderildi");
    }
    public void bilgiGonder(Kullanici kullanici,String mesaj){
        bildirimGoster(kullanici.getIP(), mesaj);
    }


}
