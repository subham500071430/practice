package designPatterns.behavioral.observer;

public class EmailAlertObserver implements Observer{

    String user;

    public EmailAlertObserver(String user){
           this.user = user;
    }

    @Override
    public void update() {

         System.out.println("Email sent to "+user);
    }
}
