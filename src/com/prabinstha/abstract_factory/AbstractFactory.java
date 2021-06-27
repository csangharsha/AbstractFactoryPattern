package com.prabinstha.abstract_factory;

import com.prabinstha.factory.AbstractShapeFactory;
import com.prabinstha.factory.impl.RoundedShapeFactory;
import com.prabinstha.factory.impl.ShapeFactory;

public class AbstractFactory {

    public static final AbstractFactory INSTANCES = new AbstractFactory();

    private AbstractFactory() {

    }

    public static AbstractFactory getInstances() {
        return INSTANCES;
    }

    public AbstractShapeFactory getShapeFactory(boolean isRounded) {
        if(isRounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }

}
