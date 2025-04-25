package root;
import sorts.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(new Rectangle(800,600),800);
        Sort bubble = new BubbleSort(100,window.mainGraph);
        bubble.sort();
    }
}