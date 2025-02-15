import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import java.io.InputStream;

public class MusicPlayer {
    public static void playMusic() {
        try {
            InputStream audioStream = MusicPlayer.class.getClassLoader().getResourceAsStream("kiss_me.mp3");
            if (audioStream == null) {
                System.out.println("⚠ No se encontró el archivo de audio.");
                return;
            }

            AdvancedPlayer player = new AdvancedPlayer(audioStream);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
