import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener{
JLabel label;
JButton btn;
JTextField tf;
int num;
int attempts;
public GUI(){
setSize(400,400);
tf = new JTextField();
btn = new JButton("Try");
label = new JLabel();
tf.setBounds(30,40,50,60);
btn.setBounds(50,06,70,80);
label.setBounds(20,30,40,50);
setRandomNumber();
//setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
add(tf); add(btn);add(label);
btn.addActionListener(this);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void setRandomNumber(){
Random random = new Random();
this.num = random.nextInt(10); // generates a random number between 1- 10
attempts = 0;

label.setText("Number of attempts: " + attempts);
}
public void actionPerformed(ActionEvent e ){
attempts ++; // increment the attempts count after every click
label.setText("Number of attempts: " + attempts);
int guess = Integer.parseInt(tf.getText());
if(guess == num){
JOptionPane.showMessageDialog(null, "Congratulations!!! successful in " +attempts + "tries");
setRandomNumber(); // if the guess is correct generate a new random number
}else {
JOptionPane.showMessageDialog(null, "Wrong guess.. try again",null,JOptionPane.ERROR_MESSAGE);
}
tf.setText(""); // Clear the text field after each attempt
}
public static void main(String [] args ){
new GUI();
}
}