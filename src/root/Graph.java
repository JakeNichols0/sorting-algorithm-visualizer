package root;
import sorts.*;
import javax.swing.*;
import java.awt.*;
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
        numberArray = new int[amount];
        graphImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        initialize();
    }
    private void initialize(){
        clear();
        double widthPer = (double)width/amount;

        for(int i=0;i<amount;i++) {
            numberArray[i] = (int) (((double) (i + 1) / amount) * height);
            fillRect((int) (widthPer * i), (int) Math.ceil(widthPer), numberArray[i], Color.white);
        }
    }

    //sorts.Sort Functions
    public void set(int a, int value){
        numberArray[a]=value;
    }
    public void swap(int a, int b){
        int temp = numberArray[a];
        numberArray[a]=numberArray[b];
        numberArray[b]=temp;
        redrawRect(a,Color.white);
        redrawRect(b,Color.white);
    }

    public int compare(int a, int b){
        if(a>b){return 1;}
        else if(a<b){return -1;}
        return 0;
    }
    public int[] getArray(){
        return numberArray;
    }

    //Graphical Functions
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(graphImg,0,0,null);
    }
    public void fillRect(int x, int width, int height, Color c){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                graphImg.setRGB(x+j,this.height-i-1,c.getRGB());
            }
        }
    }
    public void redrawRect(int index, Color c){
        double widthPer = (double)width/amount;
        fillRect(index*(int)widthPer,(int)widthPer,height,Color.BLACK);
        fillRect(index*(int)widthPer,(int)widthPer,numberArray[index],c);
    }
    public void clear(){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                graphImg.setRGB(i,j,Color.black.getRGB());
            }
        }
    }
}
