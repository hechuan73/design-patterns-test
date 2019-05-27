package com.chuan.design_patterns.adapter.default_adapter;

/**
 * The default adapter is used to solve the situation:
 *     1. target interface contains many methods.
 *     2. developers can only implement some methods.
 *
 * Solution:
 *     1. use a abstract adapter to implement the target interface and implements all methods with an empty body. Then
 *        the real adapter extends the abstract adapter and implements methods that they can implement.
 *     2. add the default implementations in the interface, so that the adapter dont need to implement all methods.
 */
public class DefaultAdapter {
}
