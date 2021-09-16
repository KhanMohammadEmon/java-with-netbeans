import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Jframe implements WindowListener {
 Frame f = new Frame("My Frame");
 Panel p1 = new Panel();
 Panel p2 = new Panel();

 public void show()
{
   f.addWindowListener(this);
   f.setSize(600,600);
   f.setBackground(Color.YELLOW);
   f.setLayout(new FlowLayout(FlowLayout.LEADING));
   f.setVisible(true);

    p1.setSize(400,400);
    p1.setBackground(Color.red);
    f.add(p1);

    p2.setSize(400,400);
    p2.setBackground(Color.green);
    f.add(p2);
}
    public static void main(String[] args) {
     Jframe jf = new Jframe();
     jf.show();
    }
    @Override
    public void windowOpened(WindowEvent e) {

    }
    @Override
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {

    }
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
}
