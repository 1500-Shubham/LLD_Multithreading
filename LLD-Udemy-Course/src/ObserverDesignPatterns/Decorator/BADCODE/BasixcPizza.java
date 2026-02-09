package ObserverDesignPatterns.Decorator.BADCODE;

public class BasixcPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public int getCost() {
        return 1;
    }
}
