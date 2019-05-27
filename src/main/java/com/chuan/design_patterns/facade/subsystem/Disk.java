package com.chuan.design_patterns.facade.subsystem;

public class Disk {
    public static void start() {
        System.out.println("Disk is started!");
    }

    public static void shutdown() {
        System.out.println("Disk is shutDown!");
    }
}
