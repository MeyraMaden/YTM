import java.util.ArrayList;

public class Database {
    private ArrayList<String> list;
    private boolean check;

    public Database(){
       list=new ArrayList<>();
       check=false;
    }

    public ArrayList<String> getList(){
        return list;
    }

    public void addLog(String message){
        if(check){
            list.add(message);
        }
    }

    public void openDB(){
        System.out.println("baglanti kuruldu");
        check=true;
    }

    public void closeDB(){
        System.out.println("baglanti koparildi");
        check=false;
    }
}
