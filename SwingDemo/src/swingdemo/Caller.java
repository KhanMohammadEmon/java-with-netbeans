//Now we learn here ProgressBar

package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Caller {
    
    public static void main(String[] args) {
        
        x obj = new x();
    }
    
}


class x extends JFrame implements ActionListener 
{
     int i;
     JProgressBar p;
     
    public x() {
        JButton b = new JButton("Add Form");
        JButton b1 = new JButton("Exit");
         
        p = new JProgressBar(0,20);
        
        this. i = 0;
        
        
        Timer t = new Timer(250,this);
        
        
        
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             t.start();
                
            }
        });
        
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             System.exit(0);
                
            }
        });
        
        add(b);
        add(b1);
        add(p);
        setLayout( new FlowLayout());      
       setVisible(true);
       setSize( 400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    if (i ==20) {
                  new AddSub();
                  dispose();
                    
                }  
    i++;
    p.setValue(i);
    }
  
}