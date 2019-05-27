package com.chuan.design_patterns.singleton;

/**
 * Lazy mode using synchronized for singleton pattern.
 *
 * Benefits:
 *      1. Save memory(create instance when we use it).
 *
 * Drawbacks:
 *      1. Thread-unsafe when JVM uses instruction rearrangement.
 *      2. When we try to get the instance, we need to get the lock.
 */
public class Singleton3 {

    private static Singleton3 instance = null;
    private Singleton3() {}

    public static synchronized Singleton3 getInstance() {
        return instance == null ? new Singleton3() : instance;
    }
}
