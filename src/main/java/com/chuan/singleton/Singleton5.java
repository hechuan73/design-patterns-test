package com.chuan.singleton;


/**
 * Static inner class mode for singleton pattern.
 *
 * Benefits:
 *     1. Save memory(create instance when we need static inner class and then loading the inner class).
 *     2. Thread-safe(the instance is static resource and created after loading inner class).
 */
public class Singleton5 {

    private Singleton5() {}
    public static Singleton5 getInstance() {
        return SingleTonHolder.instance;
    }

    private static class SingleTonHolder {
        private static Singleton5 instance = new Singleton5();
    }
}
