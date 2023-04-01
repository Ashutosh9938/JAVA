package graphics;
import java.awt.*;
import javax.swing.*;
public class Pie extends JFrame {
    final int[]data={100,200,300};
    public Pie(){
        setSize(400,500);
        setVisible(true);
    }
    public int setTotal(){
        int total=0;
        for(int i : data ){
            total=total+i;
        }
        return total;
    }
    public int [] setangle(){
        int [] angle=new int[data.length];
        for(int i=0;i<data.length;i++){
            angle[i]=Math.round(data[i]*360/setTotal());
        }
        return angle;
    }
    public void paint(Graphics g){
        Color c[] ={Color.red,Color.black,Color.PINK};
        int [] angle=setangle();
        int startAngle=0;
        for(int i=0;i<angle.length;i++){
            g.setColor(c[i]);
            g.fillArc(200, 150,100, 100, startAngle, angle[i]);
            startAngle=startAngle+angle[i];
        }      
    }
public static void main(String[]args){
    new Pie();
}
}

