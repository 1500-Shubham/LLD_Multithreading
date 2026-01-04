package designPattern;

interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("circle draw");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle draw");
    }
}

class ShapeFactory{
//    Condition use to get the shape
    Shape getShape(String input){
        switch (input){
            case "Circle": return new Circle();
            default: return new Rectangle();
        }

    }
}



public class FactoryPattern {

    public static void Main(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s = shapeFactory.getShape("Circle");
        s.draw();
    }


}
