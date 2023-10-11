package org.example.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();

        Shape obj1 = shape.getShape(ShapeType.RECTANGLE);
        obj1.draw();

        Shape obj2 = shape.getShape(ShapeType.CIRCLE);
        obj2.draw();

        Shape obj3 = shape.getShape(ShapeType.SQUARE);
        obj3.draw();
    }
}

/*
* https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
* */
