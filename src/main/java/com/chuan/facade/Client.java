package com.chuan.facade;


import com.chuan.facade.facade.Computer;

public class Client {

    public static void main(String[] args) {

        // start the computer
        Computer.start();

        // shut down the computer
        Computer.shutdown();
    }
}
