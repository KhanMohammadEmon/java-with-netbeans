package swingdemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBox_Multiple_Selection {
   public static void main(String[] args) {
        RadioDemo1 r = new RadioDemo1();
    } 
}


class RadioDemo1 extends JFrame
{
    JTextField t1;
    JButton b;
    JRadioButton r1 ,r2;
    JLabel l;
    JCheckBox c1,c2;
    
    

    public RadioDemo1() {
        
     t1 = new JTextField(15);
     b = new JButton("OK");
     r1 = new JRadioButton("Male");
     r2 = new JRadioButton("Female");
     l = new JLabel("Greating");
     c1 = new JCheckBox("Danching");
     c2 = new JCheckBox("Gaming");
     
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
     
        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        
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
             
             if(c1.isSelected())
             {
                 name = name + " Dancher";
             }
             
             if(c2.isSelected())
             {
                 name = name + " gammer";
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