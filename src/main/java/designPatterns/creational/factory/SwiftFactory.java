package designPatterns.creational.factory;

public class SwiftFactory implements VechileFactory{
    @Override
    public Vechile factoryMethod() {
        return new Swift();
    }
}
