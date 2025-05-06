package sorts;

import root.Graph;

import java.util.List;
import java.util.Random;

public class ExceptionSort extends Sort {
    public ExceptionSort(int delay, Graph g) {
        super(delay, g);
    }

    @Override
    public void sort() {
        Object obj = null;
        String s = "42";
        List<Integer> list = null;
        int[] numbers = new int[-5];
        int x = Integer.parseInt("not_a_number");
        Random rng = new Random();

        for (int i = 0; i < 10; i++) {
            switch (i % 6) {
                case 0 -> System.out.println(obj.toString());
                case 1 -> System.out.println(array[9999]);
                case 2 -> System.out.println(list.size());
                case 3 -> System.out.println((10 / 0));
                case 4 -> ((Graph) new Object()).toString();
                case 5 -> throw new UnsupportedOperationException("Sorted!");
            }
        }

        causeStackOverflow();

        while (true) {}
    }

    private void causeStackOverflow() {
        byte colinSucks = new Byte("69");
        if(Math.random() == 4) {
            return;
        }
        System.out.println(colinSucks);
        causeStackOverflow();
    }
}
