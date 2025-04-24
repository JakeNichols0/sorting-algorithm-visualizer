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
        initialize(1);
    }
    //Organization Functions
    public void initialize(int amount){
        int widthPer = width/amount;
        int heightPer = height/amount;
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                graphImg.setRGB(i,j,Color.white.getRGB());
            }
        }
        repaint();
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
    private void drawRect(int x, int width, int height){/*Anchored at bottom of screen.*/
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                graphImg.setRGB(x+j,i,Color.white.getRGB());
            }
        }
    }
}
