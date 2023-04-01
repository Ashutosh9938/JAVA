
import javax.swing.*;
import java.awt.event.*;
public class ScrollBar {

    ScrollBar(){
        JFrame f=new JFrame();
        f.setSize(400,200);
        JLabel l=new JLabel();
        l.setBounds(100,400,500,200);
        l.setVerticalAlignment(JLabel.RIGHT);
        l.setSize(400,500);
        JScrollBar s=new JScrollBar();
        s.setBounds(100,400,500,200);
        f.add(l);f.add(s);
        f.setVisible(true);
        f.setLayout(null);
        s.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e){
                l.setText("nth"+s.getValue());
            }
        });
    }
    public static void main(String[]args){
        new ScrollBar();
    }
}
