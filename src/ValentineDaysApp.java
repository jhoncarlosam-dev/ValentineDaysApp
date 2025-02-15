import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // 🚀 FALTA ESTA IMPORTACIÓN
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ValentineDaysApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Valentine Days App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.PINK);

        JLabel messageLabel = new JLabel("¡Feliz 14 de febrero!");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(messageLabel);

        JButton button = new JButton("Da clic para conseguir un premio");
        frame.add(button);

        button.addActionListener(new ActionListener() { // 🛠️ Ahora sí compila
            @Override
            public void actionPerformed(ActionEvent e) { // 🛠️ Aquí estaba el error de nombre
                JOptionPane.showMessageDialog(frame, "Eres una persona maravillosa", "Premio", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);

        // Reproducir música de fondo
        new Thread(() -> playMusic("resources/kiss_me.mp3")).start();
    }

    public static void playMusic(String filePath) {
        try {
            InputStream musicStream = new BufferedInputStream(new FileInputStream(filePath));
            AdvancedPlayer player = new AdvancedPlayer(musicStream);
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
