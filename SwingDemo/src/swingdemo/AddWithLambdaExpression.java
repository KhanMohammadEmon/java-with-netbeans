
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddWithLambdaExpression {
     public static void main(String[] args) {
        Addition1 obj1 = new Addition1();
    }
}
class Addition3 extends JFrame
{
    JButton b;
    JTextField t1,t2;
    JLabel l;
   
        public Addition3()
    {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        b = new JButton("OK");
        
        l = new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l);
        
     
        
        b.addActionListener( ae ->  
        {
           int num1 = Integer.parseInt(t1.getText());
                 int num2 = Integer.parseInt(t2.getText());
                 int value = num1+num2;
                 l.setText(value+" "); 
        }
        );
         
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
