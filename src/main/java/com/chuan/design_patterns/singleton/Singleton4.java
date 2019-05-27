package com.chuan.design_patterns.singleton;

/**
 * Lazy mode using double checking for singleton pattern.
 *
 * Benefits:
 *     1. Save memory(create instance when we use it).
 *     2. Reduce the time to get the lock if the instance has been created.
 *
 * Drawbacks:
 *     1. Thread-unsafe when JVM uses instruction rearrangement.
 *
 * Tips: If we want to use the mode to implement singleton pattern, we can use the keyword "volatile" when declaring the
 *       "instance" to forbid the instruction rearrangement.
 *
 */
public class Singleton4 {

    // private static Singleton4 instance = null; // use "volatile" to forbid the instruction rearrangement.
    private static Singleton4 instance = null;
    private Singleton4() {}

    public static synchronized Singleton4 getInstance() {
        if (instance == null) { // first check.
            synchronized (Singleton4.class) {
                if (instance == null) //second check.
                    instance = new Singleton4();
            }
        }

        return instance;
    }
}
