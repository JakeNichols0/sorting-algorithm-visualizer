package sorts;

import root.Graph;

import java.awt.*;

public class Sort {
    int[] array;
    Graph g;
    int lastIdx = 0;
    double delay;
    public Sort(Graph g,int delay){
        this.g = g;
        this.array = g.getArray();
        this.delay = (double)delay/1000;
    }
    public void sort(){}
    private void waitCursor(int idx){
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
