package solid.ocp;

public class BlackCoffee implements Coffee {
    @Override
    public void brewCoffee() {
        System.out.println("Brewing Black Coffee");
    }
}
