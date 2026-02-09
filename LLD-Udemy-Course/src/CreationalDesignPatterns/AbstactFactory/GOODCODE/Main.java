package CreationalDesignPatterns.AbstactFactory.GOODCODE;

class Application{
    private  Button button;
    private  ScrollBar scrollBar;
    Application(UIFactory uiFactory){
        this.button=uiFactory.createButton();
        this.scrollBar=uiFactory.createScrollbar();
    }
    void render(){
        this.button.render();
    }
    void scroll(){
        this.scrollBar.scroll();
    }

}



public class Main {
    public static void main(String[] args) {
        Application app = new Application(new MacFactory());
//        Now all windows related buttons and scrollbar is initiated
        app.render();
        app.scroll();

    }
}
