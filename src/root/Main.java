package root;
import sorts.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int amount = 1080;
        int delay = 1000;
        Window window = new Window(new Rectangle(1080,720),amount);
        Sort sort = new QuickSort(1000,window.mainGraph);
        while (window.getFrame().isVisible()){
            sort.shuffle();
            sort.setDelay(delay);
            sleep(750);
            sort.sort();
            sort.setDelay(1000);
            sort.endSort();
            sleep(1000);
        }

    }
    private static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}