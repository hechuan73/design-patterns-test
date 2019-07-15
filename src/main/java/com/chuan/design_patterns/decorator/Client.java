package com.chuan.design_patterns.decorator;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Component decorateA = new ConcreteDecoratorA(component);
        Component decorateB = new ConcreteDecoratorB(decorateA);
        // Component component = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
        // component.operation();

        decorateB.operation();
    }
}
