package com.chuan.design_patterns.adapter.class_adapter;

import com.chuan.design_patterns.adapter.Adaptee;
import com.chuan.design_patterns.adapter.Target;


/**
 * Class adapter extends the adaptee and implements the target interface. Because adaptee dont contains all the methods
 * that the target interface need, so we have to supplement the missing methods.
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void option2() {
        // business logic
    }
}
