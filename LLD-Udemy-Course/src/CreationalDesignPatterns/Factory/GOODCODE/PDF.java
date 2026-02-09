package CreationalDesignPatterns.Factory.GOODCODE;

import CreationalDesignPatterns.Factory.BADCODE.Document;

public class PDF implements Document {

    @Override
    public void read() {
        System.out.println("PDF");
    }
}
