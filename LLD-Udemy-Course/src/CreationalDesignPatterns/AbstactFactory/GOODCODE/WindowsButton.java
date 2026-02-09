package CreationalDesignPatterns.AbstactFactory.GOODCODE;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
