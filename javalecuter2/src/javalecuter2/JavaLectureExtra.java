package javalecuter2;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.*;

public class JavaLectureExtra implements WindowListener, ActionListener, MouseMotionListener,MouseListener { 
    
    private Frame f = new Frame("My_Frame With Menu");
   private MenuBar mb = new MenuBar();
   private Menu m1 = new Menu("File");
   private MenuItem m1_mi1 = new MenuItem("Change Colour");
   private MenuItem m1_mi2 = new MenuItem("Save");
   private MenuItem m1_mi3 = new MenuItem("Exit");
   private TextField tf = new TextField(50);
   private  Label lable = new Label("UIU-CSE");
  // private  TextField  textField = new TextField(50);
   public  void show()
    {



        m1.add(m1_mi1);
        m1_mi1.setActionCommand("change Colour");
        m1_mi1.addActionListener(this);
        m1.addSeparator();
        m1.add(m1_mi2);
        m1.addSeparator();
        m1.add(m1_mi3);
        m1_mi3.setActionCommand("exit");
        m1_mi3.addActionListener(this);
        mb.add(m1);
        f.setMenuBar(mb);
        f.add(lable);
        tf.setForeground(Color.red);
        tf.setBackground(Color.yellow);
        f.add(tf);

        f.addMouseListener(this);
        f.addMouseMotionListener(this);

        f.addWindowListener(this);
        f.setSize(600,400);
        f.setBackground(Color.green);
       // f.setLayout(null);

        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="change Colour")
        {
          int  r = (int)(Math.random()*225);
          int  g = (int)(Math.random()*225);
          int  b = (int)(Math.random()*225);
            Color c = new Color(r,g,b);
           f.setBackground(c);
        }
        if(e.getActionCommand()=="exit")
        {
            System.exit(0);
        }

    }

    public  void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    public  void windowOpened(WindowEvent e){}

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
       JavaLectureExtra abc = new JavaLectureExtra();
       abc.show();
    }


    @Override
    public void mouseDragged(MouseEvent e) {
     String s = "Mouse dragged : X = " +e.getX()+" Y = "+e.getY();
     tf.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
     tf.setText("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
     tf.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
    tf.setText("Mouse Exited");
    }
}
