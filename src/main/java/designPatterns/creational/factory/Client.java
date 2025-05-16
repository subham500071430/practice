package designPatterns.creational.factory;

public class Client {

    public static void main(String[] args) {

           Vechile v1 = new Swift();  // factory design pattern does not
           v1.drive();   // show object do client..it should be hidden
                         // hence will create factory class to give the object;

           Vechile v2 = new BMWFactory().factoryMethod();  // achieved factory pattern
           v2.drive();
    }
}
