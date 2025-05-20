package designPatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator implements Coffee{

       public SugarDecorator(Coffee coffee){
              super(coffee);
       }

       public String getDescription(){
              return super.getDescription() + " +Sugar";
       }

       public int getCost(){
              return super.getCost() + 2;
       }
}
