package com.chuan.singleton;

/**
 * Hungry mode for singleton pattern.
 *
 * Benefits:
 *     1. Create instance in loading class
 *     2. Thread-safe.
 *
 * Drawbacks:
 *     1. Waste memory if it is not used.
 *
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();
    private Singleton1() {}

    public static Singleton1 newInstance() {
        return  instance;
    }
}
