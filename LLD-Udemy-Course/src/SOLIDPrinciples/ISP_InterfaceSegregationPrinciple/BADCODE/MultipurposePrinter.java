package SOLIDPrinciples.ISP_InterfaceSegregationPrinciple.BADCODE;

public class MultipurposePrinter implements Machine{
    @Override
    public void scan() {
        System.out.println("Scanning with simple Printer....");
    }

    @Override
    public void print() {
        System.out.println("Printing with simple Printer....");
    }

    @Override
    public void copy() {
        System.out.println("Copying with simple Printer....");
    }
}
