package ObserverDesignPatterns.Decorator.GOODCODE;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Olive";
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }
}