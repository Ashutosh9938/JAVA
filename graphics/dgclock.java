package graphics;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class dgclock {
    JFrame f;
    JLabel l;
    public dgclock(){
        f=new JFrame();
        f.setSize(200,300);
        f.setVisible(true);
        l=new JLabel();
        l.setForeground(Color.red);
        f.add(l);
        showTime();
    }
    public void showTime(){
        while(true){
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sim=new SimpleDateFormat("HH:MM:s a" );
        String time =sim.format(cal.getTime());
        l.setText(time);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public static void main(String[]args){
    new dgclock();
}
}
