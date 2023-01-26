package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RdBtn extends JFrame implements ActionListener{
    JRadioButton a,b;
    public RdBtn(){
        setSize(400,200);
        a=new JRadioButton("RONALDO",true);
        b=new JRadioButton("MESSI",true);
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
            JOptionPane.showMessageDialog(this, "GOOD CHOICE");
        }else{
            JOptionPane.showMessageDialog(this,"HE TRYED");
        }
    }

public static void main(String[]args){

    new RdBtn();
 }
}
