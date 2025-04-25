package root;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Window {
    private final JFrame frame;
    public int width,height;
    private boolean focused = true;

    private final Graph mainGraph;

    public Window(Rectangle dimensions, int amount){
        this.width = dimensions.width;
        this.height = dimensions.height;
        
        frame = new JFrame();
        frame.setTitle("Sorting Algorithm Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(width,height);
        frame.setResizable(false);
        frame.setVisible(true);

        Rectangle bounds = frame.getContentPane().getBounds();
        this.mainGraph = new Graph(bounds.width,bounds.height,amount);

        frame.add(mainGraph);

        frame.revalidate();
        frame.repaint();

        Thread loop = new Thread(this::mainLoop); loop.start();

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
    private void mainLoop(){
        while(frame.isActive()){
            try{
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            frame.repaint();
            mainGraph.repaint();
        }
    }
}
