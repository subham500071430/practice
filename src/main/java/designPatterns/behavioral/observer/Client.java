package designPatterns.behavioral.observer;

public class Client {

    public static void main(String[] args) {

           Observable obj = new NikeShoeObservable();
           Observer obj1 = new EmailAlertObserver("Subham");
           obj.add(obj1);
           obj.setData(10);

    }
}
