package sorts;

import root.Graph;

public class BubbleSort extends Sort {
    public BubbleSort(int delay,Graph g){
        super(delay,g);
    }

    @Override
    public void sort() {
        int n = array.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    super.waitCursor(j);
                    g.swap(j,j+1);
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
