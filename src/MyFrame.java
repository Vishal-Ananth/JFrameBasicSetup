import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame() {
        
        this.setSize(420,420);
        this.setTitle("JFrame application window");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        ImageIcon logo = new ImageIcon("src/JframeLogo.png");
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(43, 147, 143));
    }
}
