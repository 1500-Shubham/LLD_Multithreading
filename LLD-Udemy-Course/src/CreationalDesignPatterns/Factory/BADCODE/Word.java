package CreationalDesignPatterns.Factory.BADCODE;

public class Word implements Document{
    @Override
    public void read() {
        System.out.println("Word");
    }
}
