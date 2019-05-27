package com.chuan.design_patterns.observer;

public class Client {
    public static void main(String[] args) {
        ObservableA observable = new ObservableA();
        observable.registerObserver(new ObserverA());
        observable.setData("Change data!");
    }
}
