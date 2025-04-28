package sorts;

import root.Graph;

public class CocktailSort extends Sort{
    public CocktailSort(int delay, Graph g){
        super(delay,g);
    }
    public void sort(){
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped)
        {
            swapped = false;

            for (int i = start; i < end - 1; ++i)
            {
                if (array[i] > array[i + 1]) {
                    waitCursor(i);
                    g.swap(i,i+1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;

            swapped = false;

            end = end - 1;
            for (int i = end - 1; i >= start; i--)
            {
                if (array[i] > array[i + 1])
                {
                    waitCursor(i);
                    g.swap(i,i+1);
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }
}
