import java.awt.Font;
import java.awt.Graphics;
import java.nio.file.WatchEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame=new JFrame();
    JLabel label=new JLabel("Welcome");
     public WelcomePage(String userId){
        label.setBounds(0,0,200,35);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setText("Hello"+userId);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

     }

    
}

