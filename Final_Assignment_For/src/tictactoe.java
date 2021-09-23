import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class tictactoe implements WindowListener , ActionListener {
    private Frame f = new Frame("WelCome to Tic Tac Toe Game Board 2 !");;
    private Button[] button = new Button[9];
    char playerMark = 1;
    public tictactoe() {

        f.setLayout(new GridLayout(3,3));
        play();

    }
   public void play()
   {
       for(int i = 0; i <= 8; i++) {
          button[i]= new Button();
           button[i].setBackground(Color.yellow);
           button[i].addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   Button buttonClicked = (Button) e.getSource();
                   if(playerMark == 1) {
                       playerMark = 0;
                       buttonClicked.setBackground(Color.green);
                   }
                   else {
                       playerMark =1;
                       buttonClicked.setBackground(Color.red);
                   }
                   display();
               }
           });
       }
   }



   public void display()
   {

   }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public  void player1()
    {

    }


    public void Show()
    {

       /* button[0].setBackground(Color.yellow);
        button[0].setForeground(Color.blue);
        button[1].setBackground(Color.yellow);
        button[1].setForeground(Color.blue);
        button[2].setBackground(Color.yellow);
        button[2].setForeground(Color.blue);
        button[3].setBackground(Color.yellow);
        button[3].setForeground(Color.blue);
        button[4].setBackground(Color.yellow);
        button[4].setForeground(Color.blue);
        button[5].setBackground(Color.yellow);
        button[5].setForeground(Color.blue);
        button[6].setBackground(Color.yellow);
        button[6].setForeground(Color.blue);
        button[7].setBackground(Color.yellow);
        button[7].setForeground(Color.blue);
        button[8].setBackground(Color.yellow);
        button[8].setForeground(Color.blue);*/




       // f.setLayout(new GridLayout(3,3));

        f.add(button[0]);
        f.add(button[1]);
        f.add(button[2]);
        f.add(button[3]);
        f.add(button[4]);
        f.add(button[5]);
        f.add(button[6]);
        f.add(button[7]);
        f.add(button[8]);


        f.addWindowListener(this);
        f.setSize(600,400);
        f.setBackground(Color.green);
        f.setVisible(true);

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

    public static void main(String[] args) {
        tictactoe j1 = new tictactoe();
        j1.Show();
    }




}
