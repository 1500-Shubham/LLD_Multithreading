package SOLIDPrinciples.ISP_InterfaceSegregationPrinciple.GoodCode;


import SOLIDPrinciples.ISP_InterfaceSegregationPrinciple.BADCODE.Machine;

public class SimplePrinter implements Scanner {
    @Override
    public void scan() {
        System.out.println("Scanning with simple Printer....");
    }

}
