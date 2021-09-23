
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc2_WithAnnoymous {
 public static void main(String[] args) {
       AddSub1 obj = new AddSub1();
 }
}


class AddSub1 extends JFrame 
{
    JTextField t1,t2;
    JButton b1, b2;
    JLabel l;
    
    public AddSub1()
    {
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        l = new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int num1 = Integer.parseInt(t1.getText());
                 int num2 = Integer.parseInt(t2.getText());
                 
                 
                 int value = num1+num2;
                 l.setText(value+" ");
            }
        });
        
        b2.addActionListener( ae ->
                {
                
                int num1 = Integer.parseInt(t1.getText());
                 int num2 = Integer.parseInt(t2.getText());
                 
                 
                 int value = num1-num2;
                 l.setText(value+" ");
            }
        );
        
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}