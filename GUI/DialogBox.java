import javax.swing.*;
import java.awt.event.*;
public class DialogBox implements ActionListener,WindowListener{
    JFrame f;
    JButton b;
    public DialogBox(){
        f=new JFrame();
        f.setSize(120,400);
        b=new JButton();
        b.setBounds(800,400,120,400);
        f.add(b);
        f.setVisible(true);
        f.setLayout(null);
        b.addActionListener(this);
        f.addWindowListener(this);

    }
    public void actionPerformed(ActionEvent e){
        String ss=JOptionPane.showInputDialog(null, "enter a number");
        int num=Integer.parseInt(ss);
        if(num%2==0){
            JOptionPane.showMessageDialog(null, "even");
                }else{
                    JOptionPane.showMessageDialog(null, "odd");
                }
    }
    public static void main(String[]args){
        new DialogBox();
    }
        public void windowClosed(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowOpened(WindowEvent e){}
        public void windowClosing(WindowEvent e) {
            int c=JOptionPane.showConfirmDialog(null,"wanna exit","choose",JOptionPane.YES_NO_OPTION);
            if(c==JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    
}   

