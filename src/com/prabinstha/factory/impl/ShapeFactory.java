package com.prabinstha.factory.impl;

import com.prabinstha.factory.AbstractShapeFactory;
import com.prabinstha.shape.Shape;
import com.prabinstha.shape.impl.Circle;
import com.prabinstha.shape.impl.Rectangle;
import com.prabinstha.shape.impl.Square;

public class ShapeFactory implements AbstractShapeFactory {

    public Shape getShape(String shapeName) {
        Shape shape;

        switch (shapeName) {
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Circle":
                shape = new Circle();
                break;
            case "Square":
                shape = new Square();
                break;
            default:
                throw new RuntimeException("Invalid Shape type");
        }
        return shape;
    }
}
