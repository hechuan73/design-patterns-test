package com.chuan.design_patterns.facade.facade;

import com.chuan.design_patterns.facade.subsystem.CPU;
import com.chuan.design_patterns.facade.subsystem.Disk;
import com.chuan.design_patterns.facade.subsystem.Memory;


/**
 * Use the facade mode to hide the complex invocations of subsystems for client.
 * Facade class composites the invocation details and provide a simple API for client to achieve the same function.
 *
 * Note: Client can also invoke the subsystem directly, but it is very complicated.
 */
public class Computer {

    public static void start() {
        System.out.println("Computer is starting!");
        CPU.start();
        Memory.start();
        Disk.start();
        System.out.println("Computer is started!");
    }

    public static void shutdown() {
        System.out.println("Computer is shutting down!");
        CPU.shutdown();
        Memory.shutdown();
        Disk.shutdown();
        System.out.println("Computer is shutdown!");
    }
}
