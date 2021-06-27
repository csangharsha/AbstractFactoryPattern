package com.prabinstha.factory.impl;

import com.prabinstha.factory.AbstractShapeFactory;
import com.prabinstha.shape.Shape;
import com.prabinstha.shape.impl.*;

public class RoundedShapeFactory implements AbstractShapeFactory {

    public Shape getShape(String shapeName) {
        Shape shape;

        switch (shapeName) {
            case "Rectangle":
                shape = new RoundedRectangle();
                break;
            case "Circle":
                shape = new Circle();
                break;
            case "Square":
                shape = new RoundedSquare();
                break;
            default:
                throw new RuntimeException("Invalid Shape type");
        }
        return shape;
    }

}
