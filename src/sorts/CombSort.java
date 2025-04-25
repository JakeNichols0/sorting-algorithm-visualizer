package sorts;

import root.Graph;

public class CombSort extends Sort{
    public CombSort(int delay, Graph g){
        super(delay,g);
    }
    public void sort(){
        int n = array.length;
        int gap = n;
        boolean swapped = true;
        while(gap != 1||swapped){
            gap = getNextGap(gap);

            swapped = false;
            for(int i=0;i<n-gap;i++){
                if(array[i]>array[i+gap]){
                    waitCursor(i);
                    g.swap(i,i+gap);
                    swapped = true;
                }
            }
        }
    }
    private int getNextGap(int gap){
        gap = (gap*10)/13;
        return Math.max(gap, 1);
    }
}
