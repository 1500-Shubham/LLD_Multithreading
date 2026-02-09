package ObserverDesignPatterns.Decorator.GOODCODE;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasixcPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
