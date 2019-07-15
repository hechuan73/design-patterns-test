package com.chuan.design_patterns.strategy;

public class Context {

    private final static Strategy concreteStrategyA = new ConcreteStrategyA();
    private final static Strategy concreteStrategyB = new ConcreteStrategyB();

    public void operation(boolean operationType) {
        if (operationType) concreteStrategyA.strategyOperation();
        else concreteStrategyB.strategyOperation();
    }
}
