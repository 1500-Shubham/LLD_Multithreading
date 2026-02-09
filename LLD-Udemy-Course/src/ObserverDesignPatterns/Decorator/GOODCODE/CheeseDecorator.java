package ObserverDesignPatterns.Decorator.GOODCODE;

import java.security.cert.CertSelector;
import java.util.zip.CheckedInputStream;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Cheese";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
