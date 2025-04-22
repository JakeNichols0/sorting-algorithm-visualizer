import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    MainFrame(){
        JFrame frame = new JFrame();
        frame.setTitle("Sorting Algorithm Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(800,600);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}
