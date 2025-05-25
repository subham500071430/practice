package solid.ocp;

public class Client {

    public static void main(String[] args) {

          Coffee cappuchino = new Cappucinno();
          Coffee blackCoffee = new BlackCoffee();

          CoffeeMachine coffeeMachine = new CoffeeMachine();
          coffeeMachine.makeCoffee(cappuchino);
          coffeeMachine.makeCoffee(blackCoffee);
    }
}
