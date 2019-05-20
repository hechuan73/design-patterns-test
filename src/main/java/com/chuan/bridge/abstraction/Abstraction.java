package com.chuan.bridge.abstraction;

import com.chuan.bridge.implementation.Implementor;

public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
