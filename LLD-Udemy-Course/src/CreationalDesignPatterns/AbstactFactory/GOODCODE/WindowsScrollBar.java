package CreationalDesignPatterns.AbstactFactory.GOODCODE;

public class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Windows ScrollBar");
    }
}
