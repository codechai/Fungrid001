package fungrid;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class FunGrid {
    Timer time=new Timer();
     int score;
    public FunGrid(){
        test u=new test(15,15);
        JOptionPane.showMessageDialog(null,"Click tiles similar to first one");     
    }

    public static void main(String[] args) {
        FunGrid f=new FunGrid();
    }
    
}
