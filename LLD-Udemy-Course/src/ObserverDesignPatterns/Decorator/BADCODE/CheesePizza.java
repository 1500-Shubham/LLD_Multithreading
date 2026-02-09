package ObserverDesignPatterns.Decorator.BADCODE;

public class CheesePizza extends BasixcPizza{
    @Override
    public String getDescription() {
        return super.getDescription() + "CheesePizza";
    }

    @Override
    public int getCost() {
        return (super.getCost() + 1);
    }
}
