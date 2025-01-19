package pharmacy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Menu {
    
        public static void main(String[] args) {
    //jframe to add components
           ImageIcon image = new ImageIcon("C:\\Users\\User\\Desktop\\demo\\demol\\src\\pharmacy\\fam.jpeg");
           Border border = BorderFactory.createLineBorder(Color.blue,3);
           JLabel label = new JLabel();
           label.setText("Pharmacy System");
           label.setIcon(image);
           label.setHorizontalTextPosition(JLabel.CENTER);
           label.setVerticalTextPosition(JLabel.TOP); // Set size and position
           label.setForeground(new Color(0,0,255));
           label.setFont(new Font("MV Boli",Font.PLAIN,20));
           label.setIconTextGap(-100);
           label.setBackground(Color.BLACK);
           label.setOpaque(true);
           label.setBorder(border);
           label.setVerticalAlignment(JLabel.CENTER);//SET VERTICAL POSITION OF ICON PLUS TEXT
           label.setHorizontalAlignment(JLabel.CENTER);
           //label.setBounds(150,150,250,250);

           JPanel adminPanel = new JPanel();
           adminPanel.setBackground(Color.red);
           adminPanel.setBounds(0,0,250,250);

           JPanel userPanel = new JPanel();
           userPanel.setBackground(Color.green);
           userPanel.setBounds(0,0,250,250);

           JPanel pharmacistPanel = new JPanel();
           pharmacistPanel.setBackground(Color.blue);
           pharmacistPanel.setBounds(0,0,250,250);






           
    
           JFrame frame=new JFrame();
            frame.setTitle("Pharmacy Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable( true);
            
            //ImageIcon image = new ImageIcon("logo.jpeg");//creates image ucon
            //frame.setIconImage(image.getImage());//change icon of java window
            //frame.getContentPane().setBackground(new Color(0,0,139));
            frame.setLayout(new BorderLayout());
            JPanel panelContainer = new JPanel();
            panelContainer.setLayout(new BorderLayout());
            panelContainer.add(adminPanel, BorderLayout.NORTH); // Admin Panel
            panelContainer.add(userPanel, BorderLayout.CENTER); // User Panel
            panelContainer.add(pharmacistPanel, BorderLayout.SOUTH); // Pharmacist Panel
         
        

            frame.add(label,BorderLayout.NORTH);
            frame.setSize(500,500);


            frame.setVisible(true);    
    }
    
    
}
