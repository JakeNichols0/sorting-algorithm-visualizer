package sorts;

import root.Graph;

import java.awt.*;

public class Sort {
    int[] array;
    Graph g;
    int lastIdx = 0;
    double delay;
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

}
