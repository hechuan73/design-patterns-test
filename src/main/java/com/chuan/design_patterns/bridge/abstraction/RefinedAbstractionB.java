package com.chuan.design_patterns.bridge.abstraction;

import com.chuan.design_patterns.bridge.implementation.Implementor;

public class RefinedAbstractionB extends Abstraction {

    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        // business logic
    }

    public void otherOperation() {}
}
