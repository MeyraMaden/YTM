public class Mail implements Iletisim {
    
    public void mailGonder(String mail,String mesaj){
        System.out.println(mail+" adresine "+mesaj+" gonderildi");
    }
    public void bilgiGonder(Kullanici kullanici,String mesaj){
        mailGonder(kullanici.getMail(), mesaj);
    }
   
}
