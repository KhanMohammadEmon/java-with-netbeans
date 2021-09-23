package tictactoe;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TicTacToe implements WindowListener,ActionListener{
   
    Frame f1;
    Button b[] = new Button[9];
    int [][] board = new int[3][3];
    Label player1,player2;
    

    public TicTacToe() {
     
          f1 = new Frame("Tic Tac Toe");
          for (int i = 0; i < 9; i++) {
          String str = "B"+i;
          b[i] = new Button(str);
        
          b[i].addActionListener(this);
          b[i].setActionCommand("B"+i);
          
          f1.add(b[i]);
          
        }
          
          player1 = new Label("p1");
          player2 = new Label("p2");
    }
    
    public  void display()
    {
        f1.setSize(800, 800);
        f1.addWindowListener(this);
        f1.setLayout(new GridLayout(3,3)); 
        f1.setVisible(true);
        

        
    }
     
    public static void main(String[] args) {
        
       TicTacToe t = new TicTacToe();
       t.display();
        
    }
    
    static void checkwinner()
    {
        
    }

    
    @Override
    public void windowOpened(WindowEvent we) {
    }
    @Override
    public void windowClosing(WindowEvent we) {
    System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent we) {
    }
    @Override
    public void windowIconified(WindowEvent we) {
    }
    @Override
    public void windowDeiconified(WindowEvent we) {
    }
    @Override
    public void windowActivated(WindowEvent we) {
    }
    @Override
    public void windowDeactivated(WindowEvent we) {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if ((ae.getActionCommand()).equals("B0")) {
            if (player1.getText().endsWith("l")) {
               b[0].setBackground(Color.red);
               b[0].setVisible(false);
               b[0].setLabel("P1");
               board[0][0] = 1; 
            }
            
            else if (player1.getText().endsWith("2")) {
               b[0].setBackground(Color.green);
               b[0].setVisible(false);
               b[0].setLabel("P2");
               board[0][0] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B1")) {
            if (player1.getText().endsWith("l")) {
               b[1].setBackground(Color.red);
               b[1].setVisible(false);
               b[1].setLabel("P1");
               board[0][1] = 1; 
            }
            
            else if (player1.getText().endsWith("2")) {
               b[1].setBackground(Color.green);
               b[1].setVisible(false);
               b[1].setLabel("P2");
               board[0][1] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B2")) {
            if (player1.getText().endsWith("l")) {
               b[2].setBackground(Color.red);
               b[2].setVisible(false);
               b[2].setLabel("P1");
               board[0][2] = 1; 
            }
            
            else if (player1.getText().endsWith("2")) {
               b[2].setBackground(Color.green);
               b[2].setVisible(false);
               b[2].setLabel("P2");
               board[0][2] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B3")) {
            if (player1.getText().endsWith("l")) {
               b[3].setBackground(Color.red);
               b[3].setVisible(false);
               b[3].setLabel("P1");
               board[1][0] = 1; 
            }
            
            else  if (player1.getText().endsWith("2")) {
               b[3].setBackground(Color.green);
               b[3].setVisible(false);
               b[3].setLabel("P2");
               board[1][0] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B4")) {
            if (player1.getText().endsWith("l")) {
               b[4].setBackground(Color.red);
               b[4].setVisible(false);
               b[4].setLabel("P1");
               board[1][1] = 1; 
            }
            
            else  if (player1.getText().endsWith("2")) {
               b[4].setBackground(Color.green);
               b[4].setVisible(false);
               b[4].setLabel("P2");
               board[1][1] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B5")) {
            if (player1.getText().endsWith("l")) {
               b[5].setBackground(Color.red);
               b[5].setVisible(false);
               b[5].setLabel("P1");
               board[1][2] = 1; 
            }
            
            else  if (player1.getText().endsWith("2")) {
               b[5].setBackground(Color.green);
               b[5].setVisible(false);
               b[5].setLabel("P2");
               board[1][2] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B6")) {
            if (player1.getText().endsWith("l")) {
               b[6].setBackground(Color.red);
               b[6].setVisible(false);
               b[6].setLabel("P1");
               board[2][0] = 1; 
            }
            
           else if (player1.getText().endsWith("2")) {
               b[6].setBackground(Color.green);
               b[6].setVisible(false);
               b[6].setLabel("P2");
               board[2][0] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B7")) {
            if (player1.getText().endsWith("l")) {
               b[7].setBackground(Color.red);
               b[7].setVisible(false);
               b[7].setLabel("P1");
               board[2][1] = 1; 
            }
            
          else  if (player1.getText().endsWith("2")) {
               b[7].setBackground(Color.green);
               b[7].setVisible(false);
               b[7].setLabel("P2");
               board[2][1] = 2; 
            }
 
          TicTacToe.checkwinner();
        }
        if ((ae.getActionCommand()).equals("B8")) {
            if (player1.getText().endsWith("l")) {
               b[8].setBackground(Color.red);
               b[8].setVisible(false);
               b[8].setLabel("P1");
               board[2][2] = 1; 
            }
            
           else if (player1.getText().endsWith("2")) {
               b[8].setBackground(Color.green);
               b[8].setVisible(false);
               b[8].setLabel("P2");
               board[2][2] = 2; 
            }
 
          TicTacToe.checkwinner();
        }

    }
    
}
