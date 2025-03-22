public class Kullanici {
    private String isim,mail,IP;
    private int tel;

    public Kullanici(String isim,String mail, String IP,int tel){
        this.isim=isim;
        this.mail=mail;
        this.IP=IP;
        this.tel=tel;
    }

    public String getIsim(){
        return isim;
    }
    public String getMail(){
        return mail;
    }
    public String getIP(){
        return IP;
    }
    public int getTel(){
        return tel;
    }

    public void setIsim(String isim){
        this.isim=isim;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public void setIP(String IP){
        this.IP=IP;
    }
    public void setTel(int tel){
        this.tel=tel;
    }


}
