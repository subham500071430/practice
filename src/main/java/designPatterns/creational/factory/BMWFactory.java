package designPatterns.creational.factory;

public class BMWFactory implements VechileFactory{
    @Override
    public Vechile factoryMethod() {
            return new BMW();
    }
}
