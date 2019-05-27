package com.chuan.design_patterns.bridge.abstraction;

import com.chuan.design_patterns.bridge.implementation.Implementor;

public class RefinedAbstractionA extends Abstraction {

    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        // business logic
    }

    public void otherOperation() {}
}
