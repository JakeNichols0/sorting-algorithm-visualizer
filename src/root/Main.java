package root;
import sorts.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int amount = 1080;
        int delay = 100;
        Window window = new Window(new Rectangle(1080,720),amount);
        Sort sort = new CocktailSort(1000,window.mainGraph);
        while (window.getFrame().isVisible()){
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