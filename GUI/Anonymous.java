
import javax.swing.*;
import java.awt.event.*;
public class Anonymous extends JFrame{
    JButton b;
    JTextField t;
    public Anonymous(){
        b=new JButton("Thich Malai");
        b.setBounds(900,100,500,600);
        t=new JTextField();
        t.setBounds(100,200,300,400);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.setText("BISTARA THICH");
            }
        });
        add(b);add(t);
        setSize(200,300);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[]args){
        new Anonymous();
    }
    
}
