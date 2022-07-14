package logowanie;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Logowanie extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Container container=getContentPane();
    JLabel userLabel=new JLabel("Nazwa");
    JLabel passwordLabel=new JLabel("Haslo");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
 
 
    Logowanie()
    {
    	addActionEvent();
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
       
    }




public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       loginButton.setBounds(50,300,100,30);
 

   }
   public void addComponentsToContainer()
   {
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(loginButton);
   
   }
   
   public void addActionEvent() {
       loginButton.addActionListener(this);
   }
	public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == loginButton) {
            String log;
            String has;
            log = userTextField.getText();
            has = passwordField.getText();
            if (log.equalsIgnoreCase("ksawi") && has.equalsIgnoreCase("123")) {
                JOptionPane.showMessageDialog(this, "Zalogowano");
            } else {
                JOptionPane.showMessageDialog(this, "Zła nazwa użytkownika lub hasło"); }
            
    	}
    	}
   
	public static void main(String[] a){
        Logowanie frame=new Logowanie();
        frame.setTitle("Logowanie");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    }