package fungrid;
import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout;
import java.awt.Color;//imports GridLayout library
import java.awt.Dimension;


 class ButtonGrid {
    Color[] c= {new Color(0xFF3333),new Color(0x7F00FF),new Color(0x009900),new Color(0xFFFFFF),new Color(0xFFFF33)};
        JFrame frame=new JFrame(); //creates frame
        JButton[][] grid; //names the grid of buttons
        public ButtonGrid(int width, int length){ //constructor
                frame.setLayout(new GridLayout(width,length)); //set layout
                grid=new JButton[width][length];
                //allocate the size of grid
                for(int y=0; y<length; y++){
                        for(int x=0; x<width; x++){
                            int c1 = (int)(Math.random() * 5+0);
                            
                                grid[x][y]=new JButton(" ");
                                grid[x][y].setBackground(c[c1]);
                               //creates new button     
                                frame.add(grid[x][y]); 
                                    //frame.//adds button to grid
                        }
                }
                frame.setPreferredSize(new Dimension(750, 750));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack(); //sets appropriate size for frame
                frame.setVisible(true); //makes frame visible
        }
        
}