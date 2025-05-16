package designPatterns.creational.abstractFactory;

public class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a victorian table!");
    }
}
