package designPatterns.creational.factory;

public class MercedesFactory implements VechileFactory{
    @Override
    public Vechile factoryMethod() {
        return new Mercedes();
    }
}
