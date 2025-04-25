package sorts;

import root.Graph;

public class InsertionSort extends Sort{
    public InsertionSort(int delay, Graph g){
        super(delay,g);
    }
    public void sort(){
        int n = array.length;
        for(int i=1;i<n;++i){
            int key = array[i];
            int j = i-1;
            while(j>=0&&array[j]>key){
                super.waitCursor(j);
                g.set(j+1,array[j]);
                j--;
            }
            g.set(j+1,key);
        }
    }
}
