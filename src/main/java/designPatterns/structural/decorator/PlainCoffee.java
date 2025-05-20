package designPatterns.structural.decorator;

public class PlainCoffee implements Coffee {

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getDescription(){
           return "Plain Coffee";
    }
}
