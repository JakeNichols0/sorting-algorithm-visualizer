package sorts;

import root.Graph;

import java.awt.*;

public class Sort {
    int[] array;
    Graph g;
    int lastIdx = 0;
    public double delay;
    public Sort(int delay, Graph g){
        this.array = g.getArray();
        this.delay = (double)delay/1000;
        this.g = g;
    }
    public void sort(){}
    public void waitCursor(int idx){
        int thickness = 3;
        thickness/=2;
        for(int i=lastIdx-thickness;i<=lastIdx+thickness;i++){
            if(i>=0&&i<array.length){
                g.redrawRect(i,Color.white);
            }
        }
        for(int i=idx-thickness;i<=idx+thickness;i++){
            if(i>=0&&i<array.length){
                g.redrawRect(i,Color.red);
            }
        }
        lastIdx = idx;
        try{
            Thread.sleep((long) delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void shuffle(){
        for(int i=0;i < array.length;i++){
            waitCursor(i);
            g.swap(i,(int)(Math.random()*array.length));
        }
    }
    public void endSort(){
        for(int i=0; i<array.length;i++){
            g.redrawRect(i,Color.green);
            try {
                Thread.sleep((long)delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(int i=0;i< array.length;i++){
            g.redrawRect(i,Color.white);
            try {
                Thread.sleep((long)delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void setDelay(int delay){
        this.delay = (double)delay/1000;
    }

}
