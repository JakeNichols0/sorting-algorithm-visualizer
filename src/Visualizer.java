import javax.swing.*;
import java.awt.*;

public class Visualizer {
    private JPanel[] panelArray;
    private int widthPer,heightPer;
    public Visualizer(int amount,FrameHandler fh){
        panelArray = new JPanel[amount];
        widthPer = fh.getWidth()/amount;
        heightPer = fh.getHeight()/amount;
        System.out.println(""+widthPer+" "+heightPer);
        for(int i=1;i<=amount;i++){
            JPanel temp = new JPanel();
            temp.setBackground(Color.white);
            temp.setBounds(widthPer*i,0,widthPer,heightPer*i);
            fh.getFrame().getContentPane().add(temp);
        }
        fh.update();
    }
}
