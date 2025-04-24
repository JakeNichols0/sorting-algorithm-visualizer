import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

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
        Graph g = new Graph(width,height,width);
        frame.add(g);
        //Visibility
        frame.setVisible(true);

        frame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                g.focused = true;
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                g.focused=false;
            }
        });
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
