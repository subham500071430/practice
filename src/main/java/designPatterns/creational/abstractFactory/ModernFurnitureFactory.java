package designPatterns.creational.abstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair(); // Create a modern chair
    }

    @Override
    public Table createTable() {
        return new ModernTable(); // Create a modern table
    }
}
