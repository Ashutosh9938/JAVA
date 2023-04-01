package graphics;
import java.awt.*;

public class NepalkoJhanda extends Panel{

    public void paint(Graphics g){
        g.setColor(Color.red);
        int [] x1 = {50, 150, 50};
        int [] y1 = {50, 100, 150};
        g.fillPolygon(x1, y1, 3);
        int [] x2 = { 50, 150,50}; 
        int [] y2 = {150, 200,250};
        g.fillPolygon(x2, y2, 3);
        g.setColor(Color.black);
        g.drawLine(50,50, 50, 300);
    }
 public static void main(String[]args){
    Frame f=new Frame();
    f.setSize(400,500);
    f.add(new NepalkoJhanda());
    f.setVisible(true);
 }   
}
