package SOLIDPrinciples.ISP_InterfaceSegregationPrinciple.GoodCode;

import SOLIDPrinciples.ISP_InterfaceSegregationPrinciple.BADCODE.Machine;

public class MultipurposePrinter implements Printer,Scanner,Copier {
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
