
import javax.swing.*;
import java.awt.event.*;
public class PopUpMenu implements ActionListener,MouseListener{
    JFrame f;
    JTextField t;
    JPopupMenu p;
    JMenuItem sa,copy,paste,cut,exit;
    public  PopUpMenu(){
        f=new JFrame();
        f.setSize(200,500);
        t=new JTextField();
        t.setBounds(200,200,400,400);
        p=new JPopupMenu();
        f.add(p);f.add(t);
        sa=new JMenuItem("SELECT ALL");
        p.add(sa);
        copy=new JMenuItem("COPY");
        p.add(copy);
        paste=new JMenuItem("PASTE");
        p.add(paste);
        cut=new JMenuItem("CUT");
        p.add(cut);
        exit=new JMenuItem("EXIT");
        p.add(exit);
        f.setVisible(true);
        f.setLayout(null);
        sa.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        cut.addActionListener(this);
        exit.addActionListener(this);
        f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        p.show(f.getContentPane(),e.getX(),e.getY());
    }
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sa){
            t.selectAll();
        }
        else if(e.getSource()==copy){
            t.copy();
        }
        else if(e.getSource()==paste){
            t.paste();
        }
        else if(e.getSource()==cut){
            t.cut();
        }else{
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new PopUpMenu();
    }

    
}
