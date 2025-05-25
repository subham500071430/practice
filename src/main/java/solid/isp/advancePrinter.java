package solid.isp;

public class advancePrinter implements printer,scanner,fax{

    @Override
    public void fax() {
        System.out.println("fax ...");
    }

    @Override
    public void print() {
        System.out.println("print ...");
    }

    @Override
    public void scan() {
        System.out.println("scan ...");
    }
}
