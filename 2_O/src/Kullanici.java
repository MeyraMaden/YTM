import java.util.List;
import java.util.ArrayList;

public abstract class Kullanici {
    protected String isim,mail;
    protected int id;
    protected List<Urun> urunler;

    public Kullanici(){
        urunler=new ArrayList<Urun>();
    }

    public abstract double getToplamTutar(double fiyat);


    public void setIsım(String isim){
        this.isim=isim;
    }

    public String getIsim(){
        return isim;
    }
    
    public List<Urun> getUrunler(){
        return urunler;
    }
    public Urun getUrun(int index){
        return getUrunler().get(index);
    }
    public void addUrun(Urun urun){
        getUrunler().add(urun);     
    }
}
