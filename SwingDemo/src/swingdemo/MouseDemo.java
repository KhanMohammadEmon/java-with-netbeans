
package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MouseDemo {
    public static void main(String[] args) {
       xyz obj = new xyz();
    }    
}

class xyz extends JFrame
{

    public xyz() {
        
        addMouseListener(new MouseAdapter() {
            
         public void mousePressed(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
             System.out.println(x+" , "+y);
    }    

        });
        
           
        setLayout(new FlowLayout());        
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
    
}
