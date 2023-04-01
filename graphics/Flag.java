package graphics;
import java.awt.*;

import javax.swing.JFrame;
 class Flag extends JFrame{
    public Flag()
    {
        setSize(400,500);
        setVisible(true);
        setBackground(Color.GREEN);
    }
    public void paint(Graphics g){
        final int x=100;
        final int y=100;
        final int w=10;
        final int h=30;
        Color [] c={Color.blue,Color.white,Color.red};
        for(int i=0;i<3;i++){
            g.setColor(c[i]);
            g.fillRect(x+(i*w),y,w,h);
        }
    }
    public static void main(String[]args){
        new Flag();
    }
}
