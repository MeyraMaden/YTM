public class Kanal {
     private String isim;
     private String link;
     
    public Kanal(String isim,String link){
        setIsim(isim);
        setLink(link);
    }

     //getter setter

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
