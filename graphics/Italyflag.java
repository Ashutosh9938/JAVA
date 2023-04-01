package graphics;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
 class Italyflag extends JFrame{
    public Italyflag()
    {
        setSize(400,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        final int x=100;
        final int y=150;
        final int w=240;
        final int h=500;
        Color [] c={Color.blue,Color.white,Color.red};
        for(int i=0;i<3;i++){
            g.setColor(c[i]);
            g.fillRect(x+(i*w),y,w,h);>
        }
    }
    public static void main(String[]args){
        new Italyflag();
    }
}

