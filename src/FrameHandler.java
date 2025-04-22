import javax.swing.*;
import java.awt.*;

public class FrameHandler extends JFrame {
    private JFrame frame;
    private JTextArea topText;

    private final int width=800,height=600;
    FrameHandler(){
        //Label Initialization
        topText = new JTextArea("placeholder");
        topText.setBounds(0,0,width,height);
        topText.setBackground(Color.BLACK);
        topText.setForeground(Color.white);
        topText.setFont(new Font("Times New Roman",Font.PLAIN,18));
        topText.setOpaque(true);

        //Frame Initialization
        frame = new JFrame();
        frame.setTitle("Sorting Algorithm Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(width,height);
        frame.setResizable(false);
        frame.setVisible(true);

        //Add Components
        frame.add(topText);
    }

    public JFrame getFrame() {
        return frame;
    }
    public void setText(String text){
        topText.setText(text);
        topText.updateUI();
    }
}
