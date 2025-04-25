package root;

import sorts.BubbleSort;
import sorts.Sort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Window {
    private final JFrame frame;
    public int width,height;
    private boolean focused = true;

    public final Graph mainGraph;

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
        Graph g = new Graph(bounds.width,bounds.height,amount);

        this.mainGraph = g;

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
        while(frame.isVisible()){
            try{
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(focused){
                frame.repaint();
                mainGraph.repaint();
            }
        }
    }
    public JFrame getFrame(){
        return frame;
    }
}
