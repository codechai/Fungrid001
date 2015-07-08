package fungrid;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.MouseInfo;
import javax.swing.JButton;
import javax.swing.JOptionPane;
class test extends ButtonGrid{
   //public Thread t;
    boolean isRunning=true;
    float xpos,ypos;
    int x,y;
    boolean mouseEntered;
    int score;
    Color s;
    //point ptr;
    public test(int w,int l)
    {
       super(w,l);
       generate();
       grid[0][0].setText("1");
       score=0;
       xpos=0;
       ypos=0;
       isRunning=true;
       s=new Color(0xFF3333);
       
       Timer time=new Timer();
                time.schedule(new TimerTask() {
                @Override
                public void run() {
                JOptionPane.showMessageDialog(null,"Your Score: " +score);
                isRunning=false;
                }
            },30*1000);
        
                
       System.out.println(grid[1][1].getText());
       CellButtonHandler[][] cellHandlers = new CellButtonHandler[w][l];
       for(int i=0;i<l;i++)
           for(int j=0;j<w;j++)
           {
               cellHandlers[i][j]=new CellButtonHandler();
               grid[i][j].addActionListener(cellHandlers[i][j]);
           }
    }
    public void generate()
    {
         Timer time=new Timer();
                time.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
               grid[0][0].setBackground(c[(int)(Math.random() * 5+0)]);
                }
            },1,5*1000);
   
    }
    private class CellButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
                        if(isRunning==false)
                        { JOptionPane.showMessageDialog(null,"Click Restart to play again");
                           return;
                        }
			
			//Get button pressed
			JButton pressed=(JButton)(e.getSource());
			
			//Get text of button
			Color thisc=pressed.getBackground();
			
			//If noughts or crosses, ignore
			if (thisc.equals(grid[0][0].getBackground())&&!"COLOR".equals(pressed.getText()))
                                {
                                 
                                 String s = "" + (char)014;
                                pressed.setBackground(new Color(255,245,238));
                                score++;
                                System.out.println(score);}

		}
	}
}