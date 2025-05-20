package designPatterns.structural.decorator;

public abstract class CoffeeDecorator {

       Coffee coffee;

       public CoffeeDecorator(Coffee coffee){
            this.coffee = coffee;
       }

       public String getDescription(){
              return coffee.getDescription();
       }

       public int getCost(){
              return coffee.getCost();
       }
}
