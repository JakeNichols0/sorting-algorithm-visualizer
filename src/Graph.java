import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Graph extends JPanel {
    private final int width,height,amount;
    public boolean focused = true;
    private final BufferedImage graphImg;

    private int[] numberArray;

    public Graph(int width,int height, int amount){
        this.amount = amount;
        this.width = width;
        this.height = height;

        this.setBackground(Color.black);
        graphImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        initialize();
    }
    //Organization Functions
    public void initialize(){
        clear();
        int widthPer = width/amount;
        for(int i=0;i<amount;i++){
            fillRect(widthPer*i,widthPer,(int)(height*Math.random()),Color.white);
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

        //update(focused);

        g2D.drawImage(graphImg,0,0,null);
    }
    private void fillRect(int x, int width, int height,Color c){/*Anchored at bottom of screen.*/
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                graphImg.setRGB(x+j,this.height-i-1,c.getRGB());//the actual max is 1 less than the height specified
            }
        }
    }
    public void clear(){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                graphImg.setRGB(i,j,Color.black.getRGB());//static screen lmao
            }
        }
    }
    public void update(boolean focused){
        //TODO: do update functions
        //placeholder for now
        if(focused){//this is really a performance draw
            clear();
            initialize();
        }

        repaint();
    }
}
