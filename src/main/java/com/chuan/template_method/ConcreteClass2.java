package com.chuan.template_method;

public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void primitiveOperation1() {
        // add logic
    }

    @Override
    protected void primitiveOperation2() {
        // add override logic
    }

    @Override
    protected void primitiveOperation3() {
        // add logic
    }

    @Override
    protected boolean hook1() {
        // add override logic
        return false;
    }
}
