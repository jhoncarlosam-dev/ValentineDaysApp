import javax.swing.*;

public class ValentineGUI extends JFrame {
    public ValentineGUI() {
        setTitle("Valentine Days App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(255, 182, 193)); // Fondo rosa

        JLabel label = new JLabel("💖 Feliz 14 de Febrero 💖", SwingConstants.CENTER);
        JButton button = new JButton("Da clic para conseguir un premio");

        button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Eres una persona maravillosa ❤️"));

        setLayout(new java.awt.FlowLayout());
        add(label);
        add(button);

        setVisible(true);
    }
}
