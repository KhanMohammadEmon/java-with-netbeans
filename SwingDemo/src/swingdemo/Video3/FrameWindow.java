
package swingdemo.Video3;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindow extends Frame implements WindowListener,ItemListener


{
    TextField tx1,tx2;
    

    public FrameWindow(String FrameTitle) {
   
        //Display the Frame window 
        super(FrameTitle);
        setLayout(new FlowLayout());
        setSize(370, 170);
        setLocation(100,100);
        addWindowListener(this);      
        setVisible(true);
        
       
        
        
      // Sample 2: Create Check boxes to denote 
      //Stationary items
      
      Label lb = new Label("Java AWT Check Box Example");
        
      tx1 = new TextField(40);
      tx2 = new TextField(40);
      Checkbox chk1 = new Checkbox("Penchil");
      Checkbox chk2 = new Checkbox("pen");
      Checkbox chk3 = new Checkbox("Rubber");
      
      
      //Sample 3: Add the controls
        add(lb);
        add(tx1);
        add(chk1);
        add(chk2);
        add(chk3);
        add(tx2);
        
        chk1.addItemListener(this);
        chk2.addItemListener(this);
        chk3.addItemListener(this);
        
    }

    
    

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Sample 5: Handle Iteam Event
    
      @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox Click1 = (Checkbox) e.getItemSelectable();
        String name = Click1.getLabel();
        tx1.setText(name+" Checkbox was clicked");
        
          if (e.getItemSelectable() == ItemEvent.SELECTED) {
              
              tx2.setText("It was Checked"); 
          }
           else
              tx2.setText("It was Un-Checked");
        
        
    }
    
    
    
    
    
    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
     System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        this.dispose();
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }

  
    
    
    
    
    
}
