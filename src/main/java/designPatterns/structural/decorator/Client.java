package designPatterns.structural.decorator;

public class Client {

    public static void main(String[] args) {

            Coffee coffee = new PlainCoffee();
            coffee = new MilkDecorator(coffee);
            coffee = new SugarDecorator(coffee);

            System.out.println(coffee.getDescription());
    }
}
