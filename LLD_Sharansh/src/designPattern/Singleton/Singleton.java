package designPattern.Singleton;

import java.util.ArrayList;
import java.util.List;

enum Symbols{
    X, O;
}

class SingletonClass{

    private static SingletonClass obj;

    private SingletonClass(){
//        Can be declared using other class
    }
    public static SingletonClass getInstance(){
        if(obj == null) {
            obj= new SingletonClass();
            return obj;
        }else return obj;
    }

    public void perform(){
        Symbols o = Symbols.X;
        List<Symbols> s= new ArrayList<>();
        s.add(Symbols.O);
        System.out.println("Single values only  boom");
    }

}


public class Singleton {
    public  static void Main(){
        SingletonClass obj = SingletonClass.getInstance();
        obj.perform();
    }


}
