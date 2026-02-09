package CreationalDesignPatterns.AbstactFactory.GOODCODE;

public class MacFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new MacScrollBar();
    }
}
