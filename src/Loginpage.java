import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginpage implements ActionListener {
    JFrame frame=new JFrame();
    JButton button=new JButton("Login");
    JButton resetButton=new JButton("Reset");
    JTextField userIdField=new JTextField();
    JPasswordField userPasswordField=new JPasswordField();
    JLabel userIdLabel=new JLabel("UserId:");
    JLabel userPassworLabel=new JLabel("Password:");
    JLabel messagLabel=new JLabel();
    HashMap<String,String> loginInfo=new HashMap<String,String>();
    //constructor
    Loginpage(HashMap<String,String> loginInfoOriginal){
        loginInfo=loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPassworLabel.setBounds(50,150,75,25);
        messagLabel.setBounds(125,250,250,35);
        messagLabel.setFont(new Font(null,Font.ITALIC,25));
        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);
        button.setBounds(125,200,100,25);
        button.addActionListener(this);
        button.setFocusable(false);
        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        frame.add(userIdLabel);
        frame.add(userPassworLabel);
        frame.add(messagLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(button);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==button){
            String userId = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            if(loginInfo.containsKey(userId)){
                if(loginInfo.get(userId).equals(password)){
                    messagLabel.setForeground(Color.red);
                    messagLabel.setText(" succesful");
                    frame.dispose();
                    WelcomePage welcomePage=new WelcomePage(userId);
                }
                else{
                    messagLabel.setForeground(Color.red);
                    messagLabel.setText("Wrong password weirdo");
                }
            }else{
                messagLabel.setForeground(Color.red);
                messagLabel.setText("Username not found");
            }

        }
        
    }
    
    
}
