package solid.isp;

// an interface should not be fat . it should have a specific role
// otherwise it should be segregated

public interface machine {

       public void print();

       public void scan();

       public void fax();
}

/*

public class Printer implements machine {

       @Override
       public void print(){
             System.out.println("Printing ..");
       };

       @Override
       public void scan(){
             System.out.println("Not Supported");
       };
}

 */