
package fungrid;

import javax.swing.JOptionPane;

class gameOver {
     int score;
    public gameOver(user u)
    {
         this.score=u.score;
         JOptionPane.showMessageDialog(null, "GAME OVER \n Your score:"+u.score);
    }
    
}
