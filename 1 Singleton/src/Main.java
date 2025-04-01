public class Main {
    public static void main(String[] args) throws Exception {
        
        MainActivity mainActivity = new MainActivity();
        ListeActivity listeActivity = new ListeActivity();
        
        mainActivity.onCreate();
        listeActivity.onCreate();
        Kanal kanal = listeActivity.kanalSec(0);
        mainActivity.onCreate();
        mainActivity.oynat(kanal);

        Main.sleep(5000);
        listeActivity.onCreate();
        kanal = listeActivity.kanalSec(1);
        mainActivity.onCreate();
        mainActivity.durdur();

        mainActivity.oynat(kanal);
    }

        public static void sleep(int sure) {
            try {
                Thread.sleep(sure);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
