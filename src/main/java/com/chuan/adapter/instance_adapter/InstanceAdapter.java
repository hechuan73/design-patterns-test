package com.chuan.adapter.instance_adapter;

import com.chuan.adapter.Adaptee;
import com.chuan.adapter.Target;


/**
 * Instance adapter implements the target interface and has a field of Adaptee(a composite relationship). We use the
 * methods of field "adaptee" to supplement the methods that the client need.
 *
 * Tip: If the target is a class instead of an interface, you can only use the instance adapter (extend the target and
 * has a field of Adaptee) to adapt it.
 */
public class InstanceAdapter implements Target {

    private Adaptee adaptee;

    @Override
    public void option1() {
        adaptee.option1();
    }

    @Override
    public void option2() {
        // business logic
    }
}
