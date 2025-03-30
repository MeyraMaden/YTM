import java.util.ArrayList;

class ListeActivity implements Activity{

    ArrayList<Kanal> kanalListesi;


    public void onCreate(){     
    //arayüz oluşturma sürecinde oluşturmamız gerekenleri burda gösteriyoruz
        kanalListesi=kanalListesi();
    }
    
    public Kanal kanalSec(int index){
        return kanalListesi.get(index);
    }
    
    public ArrayList<Kanal> kanalListesi(){
        System.out.println("ListenActivity Arayuzu");
        ArrayList<Kanal> kanalListesi=new ArrayList<>();

        Kanal kanal1 = new Kanal("Kanal 1", "www.kanal1.com");
        Kanal kanal2 = new Kanal("Kanal 2", "www.kanal2.com");
        kanalListesi.add(kanal1);
        kanalListesi.add(kanal2);

        return kanalListesi;
    }


}
