package com.chuan.bridge.abstraction;

import com.chuan.bridge.implementation.Implementor;

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
