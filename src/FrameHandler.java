import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FrameHandler {
    private final JFrame frame;
    public int width,height;
    public Rectangle bounds;
    private boolean focused = true;

    FrameHandler(int width,int height, int amount){
        this.width = width;
        this.height = height;
        
        frame = new JFrame();
        frame.setTitle("Sorting Algorithm Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(width,height);
        frame.setResizable(false);

        frame.setVisible(true);
        this.bounds = frame.getContentPane().getBounds();

        frame.add(new Graph(bounds.width,bounds.height,amount));

        frame.revalidate();
        frame.repaint();

        frame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                focused = true;
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                focused=false;
            }
        });
    }
}
