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
        g.redrawRect(lastIdx, Color.white);
        g.redrawRect(idx, Color.red);
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
    public void setDelay(int delay){
        this.delay = (double)delay/1000;
    }

}
