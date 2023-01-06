//anonymous class
import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame{
    
    TextField tf;
    Button b;
    Gui(){
        setSize(200,400);
        tf=new TextField();
        tf.setBounds(200,500,400,300);
        b=new Button("Decrease Me");
        b.setBounds(12,13,14,15);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(){
                tf.setText("kaka");
            }
        });
        add(tf);add(b);
        setLayout(null);
        setVisible(true);
    }
public static void main(String[]args){
    new Gui();
}
    
}
