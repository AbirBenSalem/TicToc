

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTocGUI {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			   public void run()
			   {
			    TicTacToeFrame frame=new TicTacToeFrame();
			   }
			  });

	}

}
class TicTacToeFrame extends JFrame
{

 JButton [][] buttons= new JButton[3][3];
 JTextField statusBar;
 GamePanel panel;
 Integer turn;
 GameListener listener=new GameListener();
 Integer count;

 public TicTacToeFrame()
 {
  setLayout(new BorderLayout());

  panel=new GamePanel();
  add(panel,BorderLayout.CENTER);

  statusBar=new JTextField("Player1's Turn");
  statusBar.setEditable(false);
  add(statusBar,BorderLayout.SOUTH);

  setTitle("Tic Tac Toe!");
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(700,700,500,500);
 }
 

 class GamePanel extends JPanel
 {

  public GamePanel()
  {
   setLayout(new GridLayout(3,3));
   turn =1;
   count=0;
   for(int i=0;i<3;i++)
    for(int j=0;j<3;j++)   {
     buttons[i][j]=new JButton();
     buttons[i][j].putClientProperty("INDEX", new Integer[]{i,j});
     buttons[i][j].putClientProperty("OWNER", null);
     buttons[i][j].addActionListener(listener);
     add(buttons[i][j]);
    }
  }
 }

 class GameListener implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   count++;
   JButton b=(JButton)e.getSource();
   Integer[]index=(Integer[]) b.getClientProperty("INDEX");

   System.out.println(turn); //turn                  //   //System.out.println("["+index[0]+"]"+"["+index[1]+"]");         //
   b.putClientProperty("OWNER", turn);
   //Icon ico=new ImageIcon(turn.toString()+".gif");
   Icon ico=null;
   if(turn==1)
	  ico=new ImageIcon("x.png");
   else if(turn==2)
	  ico=new ImageIcon("o.png");
   b.setIcon(ico);
   b.setEnabled(false);
   boolean result=checkVictoryCondition(index);
   if(result)
   {
    JOptionPane.showMessageDialog(null, "Congrats!!!!  Player "+turn.toString()+" Wins");
    initComponents();
   }
   else
   {
    if(turn==1)
    {
     turn=2;
     statusBar.setText("Player2's Turn");
    }
    else
    {
     turn=1;
     statusBar.setText("Player1's Turn");
    }
   }
   if(count==9)
   {
    JOptionPane.showMessageDialog(null, "Match is a draw!");
    initComponents();

   }

  }

  Integer getOwner(JButton b)
  {
   return (Integer)b.getClientProperty("OWNER");
  }

  boolean checkVictoryCondition(Integer [] index)
  {
   

   Integer a=index[0];
                Integer b=index[1];
   int i;

   //check row
   for(i=0;i<3;i++)  {
    if(getOwner(buttons[a][i])!=getOwner(buttons[a][b]))
     break;
   }
   if(i==3)
    return true;

   //check column
   for(i=0;i<3;i++)  {
    if(getOwner(buttons[i][b])!=getOwner(buttons[a][b]))
     break;
   }
   if(i==3)
    return true;

   //check diagonal
   if((a==2&&b==2)||(a==0&&b==0)||(a==1&&b==1)||(a==0&&b==2)||(a==2&&b==0))
   {
    //left diagonal
	for(i=0;i<3;i++)  {
		if(getOwner(buttons[i][i])!=getOwner(buttons[a][b]))
		break;
	}
    if(i==3)
     return true;

    //right diagonal
    if((getOwner(buttons[0][2])==getOwner(buttons[a][b]))&&(getOwner(buttons[1][1])==getOwner(buttons[a][b]))&&(getOwner(buttons[2][0])==getOwner(buttons[a][b])))
     return true;

    }

   return false;

  }
 }



 void initComponents()
 {
  for(int i=0;i<3;i++)   
                         for(int j=0;j<3;j++)  {
    buttons[i][j].putClientProperty("INDEX", new Integer[]{i,j});
    buttons[i][j].putClientProperty("OWNER",null);
    buttons[i][j].setIcon(null);
    buttons[i][j].setEnabled(true);
    turn=1;
    count=0;
    statusBar.setText("Player1's Turn");

   }
 }

}
