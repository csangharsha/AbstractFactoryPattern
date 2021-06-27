package com.prabinstha;

import com.prabinstha.abstract_factory.AbstractFactory;
import com.prabinstha.factory.AbstractShapeFactory;
import com.prabinstha.shape.Shape;

public class Main {

    public static void main(String[] args) {
        if(args.length < 1 ) {
            return;
        }

        AbstractFactory abstractFactory = AbstractFactory.getInstances();
        AbstractShapeFactory factory = abstractFactory.getShapeFactory(args[0].equals("Rounded"));
        Shape shape = factory.getShape(args[1]);
        shape.draw();
    }

}
