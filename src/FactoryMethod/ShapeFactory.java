package FactoryMethod;

public class ShapeFactory {

    public Shape getShape(String shape){
        if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")){
            return new Square();
        } else {
            return new Rectangle();
        }
    }
    
}
