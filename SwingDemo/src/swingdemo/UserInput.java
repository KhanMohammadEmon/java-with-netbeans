
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicSliderUI;



public class UserInput {
    public static void main(String[] args) {
        RadioDemo r = new RadioDemo();
    }
    
}

class RadioDemo extends JFrame
{
    JTextField t1;
    JButton b;
    JRadioButton r1 ,r2;
    JLabel l;
    

    public RadioDemo() {
        
     t1 = new JTextField(15);
     b = new JButton("OK");
     r1 = new JRadioButton("Male");
     r2 = new JRadioButton("Female");
     l = new JLabel("Greating");
     
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
     
        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);
        
        b.addActionListener(new ActionListener() 
        {
         @Override
         public void actionPerformed(ActionEvent ae) {
             String name = t1.getText();
             
             if (r1.isSelected()) {
                 
                 name = "Mr. "+name;
                 
             }
             else
             {
                 name = "Mrs. "+name;
             }
             
             l.setText(name);
             
         }
     });
        
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
  
    
    }
    
}