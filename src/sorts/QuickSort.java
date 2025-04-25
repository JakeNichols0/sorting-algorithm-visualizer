package sorts;

import root.Graph;

public class QuickSort extends Sort{
    public QuickSort(int delay, Graph g){
        super(delay,g);
    }
    public void sort(){
        quickSort(0,array.length-1);


    }
    private void quickSort(int low, int high){
        if(low<high){
            int pi = partition(low,high);
            quickSort(low, pi-1);
            quickSort(pi+1,high);
        }
    }
    private int partition( int low, int high){
        int pivot = array[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(array[j]<pivot){
                i++;
                waitCursor(i);
                g.swap(i,j);
            }
        }
        g.swap(i+1,high);
        return i+1;
    }
}
