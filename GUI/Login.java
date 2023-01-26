package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login implements ActionListener{
    JFrame f,ff;
    JButton b;
    JTextArea t;
    JPasswordField p;
    JLabel l;
    
    public Login(){
        f=new JFrame();
        f.setSize(800,800);
        t = new JTextArea();
        t.setBounds(200,200,100,30);
        p = new JPasswordField();
        p.setBounds(150,100,100,30);
        b = new JButton("LOGIN");
        b.setBounds(400,600,100,30);
        b.addActionListener(this);
        f.add(b);f.add(p);f.add(t);
        f.setVisible(true);
        f.setLayout(new GridLayout(2,2));

    }
    public void actionPerformed(ActionEvent e){
        String username=t.getName();
        String password=String.valueOf(p.getPassword());
        if(username.equals("ncit")&&password.equals("123")){
            showDashBoard(username);
        }
        else{
            JOptionPane.showMessageDialog(null, "invalid", "login",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void showDashBoard(String name){
        ff=new JFrame();
        f.setSize(200,300);
        l=new JLabel(name);
        f.add(l);
        f.dispose();

    }
    public static void main(String[]args){
        new Login();
    }
}
