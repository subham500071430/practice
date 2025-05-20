package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NikeShoeObservable implements Observable{

    List<Observer> observerList;
    int stockCount;

    public NikeShoeObservable(){
           observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
          observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
          observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {

           for(Observer observer : observerList){
               observer.update();
           }
    }

    @Override
    public void setData(int stockCount) {
          if(this.stockCount==0){
              notifyObserver();
          }
          this.stockCount = stockCount;
    }

    @Override
    public int getData() {
        return stockCount;
    }
}
