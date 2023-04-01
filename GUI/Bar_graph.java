
import java.awt.*;
import javax.swing.*;

class Bar_graph extends JFrame{
    final int[] data={50,70,100,40};
    final int frame_height=800;
    final int frameWidth=800;
    final int frame_Width=30;
public Bar_graph(){
    setSize(frameWidth,frame_height);
    setVisible(true);
}
public int getMax(){
    int max =0;
    for(int i : data){
        if(i > max){
            max=i;
    }
}
return max;
}
public int[] TransformData(){
    int[]td=new int [data.length];
    int max_height=700;
    int max=getMax();
    for(int i=0;i<data.length;i++){
        td[i]=Math.round((max_height*data[i])/max);
    }
return td;
}
public void paint(Graphics g){
    Color[] colors={Color.red,Color.black,Color.pink,Color.green};
    int[] t=TransformData();
    for(int i=0;i<t.length;i++){
        g.setColor(colors[i]);
        g.fillRect(i*frameWidth,frame_height-t[i],frame_Width,t[i]);
    }
}
public static void main(String[]args){
    new Bar_graph();

}
}