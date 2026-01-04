import TicTacToe.Game;
import designPattern.Abstract.AbstractFactoryPattern;
import designPattern.DecoratorPizzaPattern;
import designPattern.FactoryPattern;
import designPattern.ObserverPattern;
import designPattern.Singleton.Singleton;
import designPattern.StatePattern.StatePattern;
import designPattern.StrategyPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {
//        StrategyPattern.Main();
//        ObserverPattern.Main();
//        DecoratorPizzaPattern.Main();
//        FactoryPattern.Main();
//        AbstractFactoryPattern.Main();
//        Singleton.Main();
//        StatePattern.Main();
        Game game =new Game();
        game.initializeGame();
        game.playGame();
    }
}