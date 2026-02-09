package ObserverDesignPatterns.Decorator.BADCODE;

public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getCost());
    }
}
