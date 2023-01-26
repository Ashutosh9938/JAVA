package GUI; 
import javax.swing.*;
import java.awt.*;
public class Grid {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    public Grid(){
        f=new JFrame();
        f.setSize(200,300);
        b1=new JButton("I");
        b2=new JButton("L");b3=new JButton("O");b4=new JButton("V");b5=new JButton("E");b6=new JButton("Y");b7=new JButton("O");b8=new JButton("U");
        f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5); f.add(b6); f.add(b7); f.add(b8);
        f.setLayout(new GridLayout(3,3,20,25));
        f.setVisible(true);
    }
    public static void main(String[]args){
        new Grid();
    }
}
