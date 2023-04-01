
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CheckBx extends JFrame implements ActionListener{
    JCheckBox a,b;
    public CheckBx(){
        setSize(400,200);
        a=new JCheckBox("a",true);
        b=new JCheckBox("b",true);
        add(a);add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        ButtonGroup bg=new ButtonGroup(); 
        bg.add(a);bg.add(b);
        a.addActionListener(this);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==a){
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
    }
    public static void main(String[]args){
        new CheckBx();
    }
}
