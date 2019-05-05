package com.chuan.singleton;


/**
 * Enum mode for singleton pattern.
 *
 * Benefits:
 *     1. Save memory.
 *     2. Thread-safe.
 *     3. Serializable without other specific logic.
 *     4. Able to resist the attack of reflection.
 *     5. Concise writing style.
 */
public enum  Singleton6 {
    INSTANCE;

    Singleton6() {
        // init logic
    }
}
