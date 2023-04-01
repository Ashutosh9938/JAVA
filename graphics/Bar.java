package graphics;
import java.awt.*;
import javax.swing.*;

public class Bar extends JFrame {
    final int[]data={20,40,30,60};

    public Bar(){
        setSize(400,500);
        setVisible(true);
    }
    public int getTotal(){
        int total=0;
        for(int i : data){
            total=total+i;
        }
        return total;
    }
    public int getMax(){
        int max=0;
        for(int d: data){
            if(d>max){
                max=d;
            }
        }
        return max;
    }
    public int[] getTrans(){
        int [] trans= new int[data.length];
        for(int i=0;i<data.length;i++){
            trans[i]=Math.round(data[i]*400/getMax());
        }
        return trans;
    }
    public void paint(Graphics g){
        int width=30;
        Color c[]={Color.red,Color.blue,Color.green,Color.gray};
        int [] metadata=getTrans();
        for(int i=0;i<metadata.length;i++){
            g.setColor(c[i]);
            g.fillRect(i*width, 500-metadata[i], width, metadata[i]);

        }
    }
public static void main(String[]args){
    new Bar();
}
}
