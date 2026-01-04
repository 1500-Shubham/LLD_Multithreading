package designPattern;

abstract class BasePizza{
    abstract int cost();
}

class Margreta extends BasePizza{
    int cost(){
        return 100;
    }
}

abstract class ToppingsDecorator extends BasePizza{

}

class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;
    Mushroom(BasePizza b){
        this.basePizza=b;
    }

    int cost(){
        return this.basePizza.cost()+10;
    }

}
class Salad extends ToppingsDecorator{
    BasePizza basePizza;
    Salad(BasePizza b){
        this.basePizza=b;
    }

    int cost(){
        return this.basePizza.cost()+20;
    }

}



public class DecoratorPizzaPattern {
//    has a and is a relation both hota

    public static void Main(){
        BasePizza margreta = new Salad(new Mushroom(new Margreta()));
        System.out.println(margreta.cost());
    }
}
