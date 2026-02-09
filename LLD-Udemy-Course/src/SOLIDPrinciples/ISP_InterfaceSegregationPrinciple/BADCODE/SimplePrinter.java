package SOLIDPrinciples.ISP_InterfaceSegregationPrinciple.BADCODE;


public class SimplePrinter  implements Machine {
    @Override
    public void scan() {
        System.out.println("Scanning with simple Printer....");
    }


//    Waste of these methods make smaller interface
    @Override
    public void print() {
    throw  new UnsupportedOperationException("Print not allowed in simple printer");
    }

    @Override
    public void copy() {
        throw  new UnsupportedOperationException("Copy not allowed in simple printer");
    }
}
