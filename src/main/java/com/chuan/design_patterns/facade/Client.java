package com.chuan.design_patterns.facade;


import com.chuan.design_patterns.facade.facade.Computer;

public class Client {

    public static void main(String[] args) {

        // start the computer
        Computer.start();

        // shut down the computer
        Computer.shutdown();
    }
}
