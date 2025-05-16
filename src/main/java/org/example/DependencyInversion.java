package org.example;

public class DependencyInversion{
    public static void main(String[] args) {

    }
}

interface Logger {
    void log(String message);
}

class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}

class OrderService {
    private Logger logger;

    public OrderService(Logger logger) {
        this.logger = logger;  // Depend on abstraction
    }

    public void placeOrder() {
        // order logic
        logger.log("Order placed");
    }
}
