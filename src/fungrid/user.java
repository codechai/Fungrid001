package fungrid;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.JButton;
class user extends ButtonGrid implements Runnable,MouseListener {
   //public Thread t;
    boolean isRunning;
    float xpos,ypos;
    int x,y;
    boolean mouseEntered;
    int score;
    public user(int w,int l)
    {
       super(w,l);
       score=0;
       xpos=0;
       ypos=0;
       isRunning=true;
       for(int i=0;i<l;i++)
           for(int j=0;j<w;j++)
           {
               grid[i][j].addMouseListener(new MouseAdapter()
               { @Override      
               public void mouseClicked(MouseEvent e)
               {
                   JButton source=(JButton)e.getSource();
                    xpos=e.getXOnScreen();
        ypos=e.getYOnScreen();
        System.out.println(xpos+ypos+"yeqaaaahhh");
  // Save the coordinates of the click lke this. 
 //System.out.println("yeqaaaahhh");
  //JOptionPane.showMessageDialog(null, "x:"+xpos+"y:"+ypos);
  // Check if the click was inside the rectangle area. 
   x=(int)xpos/50;
    y=(int)ypos/50;
    System.out.println("score");
    Color col=grid[x][y].getBackground();
    System.out.println(grid[x][y].getBackground());
    Color s=new Color(0xFF3333);
    if(grid[x][y].getBackground()==s)
    {score++;
    System.out.println(score);

               }
                       }});
      // JOptionPane.showMessageDialog(null,"in user!!");
    }}//}//}
    @Override
    public void run(){
        //code here
        try{while(isRunning){
           if(mouseEntered)
           increment(); 
           //hello();
        //System.out.println("ur score"+score);
        }
    }
        catch(Exception e)
        {
           // e.printStackTrace();
            System.out.println("error");
        }
    }
    void hello()
    {
       JOptionPane.showMessageDialog(null,"in user!!");
    }
   public void kill()
   {
       isRunning=false;
   }
   void increment()
   {
        //xpos=me.getX();
        //ypos=me.getY();
        System.out.println(xpos+ypos+"yeqaaaahhh");
     x=(int)xpos/10;
    y=(int)ypos/10;
    Color s=new Color(0xFF3333);
    if(grid[x][y].getBackground()==s)
    {score++;
    System.out.println(score);
   }}
   //void setx(float x)
   //{
   //    xpos=x;
   //}
   //void sety(float y)
   //{
      // ypos=y;
   //}
    @Override
    public void mouseClicked (MouseEvent me) {
        //JButton source=(JButton)me.getSource();
        //setx(me.getX());
        //sety(me.getY());
         xpos=me.getXOnScreen();
        ypos=me.getYOnScreen();
        System.out.println(xpos+ypos+"yeqaaaahhh");
  // Save the coordinates of the click lke this. 
 //System.out.println("yeqaaaahhh");
  //JOptionPane.showMessageDialog(null, "x:"+xpos+"y:"+ypos);
  // Check if the click was inside the rectangle area. 
   x=(int)xpos/50;
    y=(int)ypos/50;
    System.out.println("score");
    Color col=grid[x][y].getBackground();
    System.out.println(grid[x][y].getBackground());
    Color s=new Color(0xFF3333);
    if(grid[x][y].getBackground()==s)
    {score++;
    System.out.println(score);

 }}

    @Override
    public void mousePressed(MouseEvent me) {
       xpos=me.getX();
        ypos=me.getY();
  // Save the coordinates of the click lke this. 
 System.out.println("yeqaaaahhh"); 
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        mouseEntered=true;
        //JOptionPane.showMessageDialog(null, "yeahx:"+xpos+"y:"+ypos);
        System.out.println("ENterde");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        mouseEntered=false;
    }
       public user getScore()
       {
           return this;
       }

}
   
     
                    