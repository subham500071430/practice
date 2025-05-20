package designPatterns.behavioral.observer;

import java.util.List;

public interface Observable {

       public void add(Observer observer);

       public void remove(Observer observer);

       public void notifyObserver();

       public void setData(int stockCount);

       public int getData();
}


// observable is the thing that I need to watch..I could be any product
// observer is the user which has clicked on notify me