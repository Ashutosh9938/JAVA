
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyDialog {
    static JDialog d;
    static JButton btn;
    static JLabel l;
    public static void ShowDialog(JFrame frame,String msg,String title){
        d=new JDialog(frame,title);
        d.setSize(400,600);
        btn=new JButton("OK");
        btn.setBounds(120,300,400,500);
        l=new JLabel(msg);
        d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.add(l);
        d.add(Box.createRigidArea(new Dimension(0,20)));
        d.add(btn);
        d.setVisible(true);
        d.setLocationRelativeTo(frame);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setVisible(false);
            }
        });

    }
    public static void main(String[]args){
        new MyDialog();
    }
}