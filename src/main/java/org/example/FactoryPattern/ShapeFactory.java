package org.example.FactoryPattern;

public class ShapeFactory {
    public Shape getShape(ShapeType type) {
        if (type == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if (type == ShapeType.CIRCLE) {
            return new Circle();
        } else if (type == ShapeType.SQUARE) {
            return new Square();
        } else
            return null;
    }
}
