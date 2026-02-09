package CreationalDesignPatterns.Factory.GOODCODE;

import CreationalDesignPatterns.Factory.BADCODE.Document;

public class Word implements Document {
    @Override
    public void read() {
        System.out.println("Word");
    }
}
