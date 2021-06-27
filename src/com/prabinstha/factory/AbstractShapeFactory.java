package com.prabinstha.factory;

import com.prabinstha.shape.Shape;

public interface AbstractShapeFactory {
    Shape getShape(String shapeName);
}
