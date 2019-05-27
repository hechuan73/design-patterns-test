package com.chuan.design_patterns.template_method;

public abstract class AbstractClass {

    private void templateMethod() {

        primitiveOperation1();
        primitiveOperation2();
        if (hook1()) primitiveOperation3();
    }

    // abstract method, no implement
    protected abstract void primitiveOperation1();

    // basic method, default implement
    protected void primitiveOperation2() {
        // default implement logic
    }

    // abstract method, no implement
    protected abstract void primitiveOperation3();

    // hook method
    protected boolean hook1() {
        return true;
    }
}
