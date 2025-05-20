package designPatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator implements Coffee{

       public MilkDecorator(Coffee coffee){
              super(coffee);
       }

       public String getDescription(){
              return super.getDescription()+" +Milk";
       }

       public int getCost(){
              return super.getCost() + 5;
       }
}
