import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Graph extends JPanel {
    private final int width,height;
    private final BufferedImage graphImg;
    public Graph(int width,int height){
        this.width = width;
        this.height = height;
        this.setBackground(Color.black);

        graphImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    }
    //Organization Functions
    public void initialize(int amount){
        double widthPer = (double)width/amount;
        double heightPer = (double)height/amount;
        for(int x=0;x<amount;x++){

        }
    }
    public void shuffle(){

    }

    //Sort Functions
    public void set(int a, int value){

    }
    public void swap(int a, int b){

    }

    public int compare(int a, int b){
        return 0;
    }

    //Graphical Functions
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(graphImg,0,0,null);
    }
}
