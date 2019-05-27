package com.chuan.design_patterns.adapter;


/**
 * Adaptee is the existing class in the system, which it dont contains all the methods which the client(target interface)
 * need, so it need to be adapted to provide the full methods for the client.
 */
public class Adaptee {

    public void option1() {
        // business logic
    }
}
