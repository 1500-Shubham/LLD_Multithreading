package ObserverDesignPatterns.Decorator.GOODCODE;

public abstract class PizzaDecorator implements Pizza{
//    Decorators are pizza itself and contain pizza in consturctor

    private  Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza= pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    @Override
    public int getCost() {
        return this.pizza.getCost();
    }
}
