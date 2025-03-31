public class MainActivity implements Activity {
    
    private MediaPlayer mediaPlayer;

    public void onCreate(){
        mediaPlayer=MediaPlayer.getMediaPlayer();
    }

    public void oynat(Kanal kanal) {
        mediaPlayer.kanalSec(kanal);
        mediaPlayer.oynat(kanal);
    }
    public void durdur() {
        mediaPlayer.durdur();
    }
    
}
