package com.chuan.singleton;

/**
 * Lazy mode for singleton pattern.
 *
 * Benefits:
 *     1. Save memory(create instance when we use it).
 *
 * Drawbacks:
 *     1. Thread-unsafe.
 */
public class Singleton2 {

    private static Singleton2 instance = null;
    private Singleton2() {}

    public static Singleton2 getInstance() {
        return instance == null ? new Singleton2() : instance;
    }
}
