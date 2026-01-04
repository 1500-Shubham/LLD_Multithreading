// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class Bike{  
  abstract void run();  
}  
class Honda extends Bike{  
void run(){
    System.out.println("running safely");
    
}
}
interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        // Singleton a = Singleton.getInstance();
        // System.out.println(a.data);
        
        // Honda h =new Honda();
        // h.run();
        
        Rectangle d = new Rectangle();
        d.msg();
        
        
    }
}


