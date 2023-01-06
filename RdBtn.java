import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RdBtn extends JFrame implements ActionListener{
    JRadioButton a,b;
    public RdBtn(){
        setSize(400,200);
        a=new JRadioButton("a",true);
        b=new JRadioButton("b",true);
        add(a);add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        ButtonGroup bg=new ButtonGroup(); 
        bg.add(a);bg.add(b);
        a.addActionListener(this);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==a){
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
    }
    public static void main(String[]args){
        new RdBtn();
    }
}
    class MyDialog{
        static JDialog d;
        static JButton btn;
        static JLabel l;
        public static void ShowDialog(JFrame frame,String msg,String title){
            d=new JDialog(frame,title);
            btn=new JButton("OK");
            l=new JLabel(msg);
            d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
            l.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            d.add(l);
            d.add(btn);
            d.setVisible(true);
            d.setLocationRelativeTo(frame);
            btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    d.setVisible(false);
                }
            });

        }
    }


