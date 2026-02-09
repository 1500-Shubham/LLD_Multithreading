package CreationalDesignPatterns.AbstactFactory.GOODCODE;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new WindowsScrollBar();
    }
}
