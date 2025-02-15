public class Main {
    public static void main(String[] args) {
        new Thread(MusicPlayer::playMusic).start(); // Inicia la música
        new ValentineGUI(); // Muestra la interfaz gráfica
    }
}
