package com.chuan.bridge.abstraction;

import com.chuan.bridge.implementation.Implementor;

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
