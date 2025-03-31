
public class MediaPlayer implements Runnable{  
    private Kanal kanal;  
    private boolean kontrol;

    private static MediaPlayer mediaPlayer;

    private MediaPlayer(){    }

    public static MediaPlayer getMediaPlayer(){
        if(mediaPlayer==null){
            mediaPlayer=new MediaPlayer();
        }
        return mediaPlayer;
    }

    public void kanalSec(Kanal kanal){
        this.kanal=kanal;
    }
    public void oynat(Kanal kanal){
        kontrol=true;
        new Thread(this).start();        
    }    

    public void durdur() {
        kontrol = false;
    
    }


    @Override
    public void run() {
        while(kontrol) {
            Main.sleep(2000);
            System.out.println(kanal.getIsim() + " kanalı " + 
            kanal.getLink() + " linki üzerinden oynatılıyor.");
        }
    }
 
}






