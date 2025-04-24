import javax.swing.*;
import java.awt.*;

public class FrameHandler {
    private final JFrame frame;

    private final int width=800,height=600;
    FrameHandler(){
        //Frame Initialization
        frame = new JFrame();
        frame.setTitle("Sorting Algorithm Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(width,height);
        frame.setResizable(false);

        //Add Components
        frame.add(new Graph(width,height));
        //Visibility
        frame.setVisible(true);
    }

    //Accessors
    public JFrame getFrame() {
        return frame;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    //Mutators
    public void addComponent(Component c){
        frame.add(c);
    }
}
