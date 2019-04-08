package base;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class test extends JFrame {
public test(){
Container container=this.getContentPane();
this.setLayout(null);

JPanel jPanel1=new JPanel();
jPanel1.setBounds(0, 0,100, 100);
jPanel1.setBackground(Color.red);
container.add(jPanel1);

JPanel jPanel2=new JPanel();
jPanel2.setBounds(0, 0,200,200);
jPanel2.setBackground(Color.blue);
container.add(jPanel2);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(600,400);
this.setVisible(true);

jPanel1.setVisible(false);
jPanel2.setVisible(false);

jPanel1.setVisible(true);jPanel2.setVisible(true);
}
public static void main(String[] args) {
new test();
}
}