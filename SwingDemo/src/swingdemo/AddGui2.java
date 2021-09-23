
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class AddGui2 {
    public static void main(String[] args) {
        Addition1 obj1 = new Addition1();
    }
    
}

class Addition1 extends JFrame
{
    JButton b;
    JTextField t1,t2;
    JLabel l;
   
        public Addition1()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        b = new JButton("OK");
        
        l = new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l);
        
        /*ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 int num1 = Integer.parseInt(t1.getText());
                 int num2 = Integer.parseInt(t2.getText());
                 int value = num1+num2;
                 l.setText(value+" ");
            }
        };
        
        b.addActionListener(al);
*/
        //Another way solve :
        
        b.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 int num1 = Integer.parseInt(t1.getText());
                 int num2 = Integer.parseInt(t2.getText());
                 int value = num1+num2;
                 l.setText(value+" ");
            }
        });
         
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
   
}