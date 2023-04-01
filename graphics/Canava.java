package graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
public class Canava extends JFrame implements MouseMotionListener {

    public Canava(){
        setSize(400,500);
        setVisible(true);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g=getGraphics();
        g.setColor(Color.red);
        g.fillRect(e.getX(), e.getY(), 5, 5);
    }
    public void MouseMoved(MouseEvent e){

    }
    public static void main(String[]args){
        new Canava();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
       
    }
    
}
