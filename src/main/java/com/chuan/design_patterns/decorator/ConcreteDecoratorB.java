package com.chuan.design_patterns.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        // other logic to enhance the business, so maybe there are other public methods.
    }
}
