package CreationalDesignPatterns.AbstactFactory.BADCODE;

public class Main {
    public static void main(String[] args) {
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();
        windowsScrollBar.scroll();

        MacButton macButton = new MacButton();
        macButton.render();

//        Tight coupling and open close violate
    }
}
