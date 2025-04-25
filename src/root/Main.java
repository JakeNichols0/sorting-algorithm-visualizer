package root;
import sorts.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int amount = 1080;
        int delay = 2500;
        Window window = new Window(new Rectangle(1080,720),amount);
        Sort sort = new QuickSort(delay,window.mainGraph);
        while (window.getFrame().isActive()){
            sort.shuffle();
            sort.setDelay(delay);
            try{
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sort.sort();
            sort.setDelay(1000);
        }

    }
}