package com.chuan.design_patterns.observer;

import java.util.Vector;


/**
 * The observer pattern in JDK is a Observable class and Observer interface, so there is a limitation if a class wants
 * to extends multiple classes. Here I implement this pattern by adding a observable interface and corresponding observer
 * interface.
 *
 * Note that I dont consider the concurrent cases for the operations of observer lists, it is just a demo.
 */
public class ObservableA implements IObservable {

    private Vector<IObserver> observers;
    private String data;

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this, data));
    }

    public void setData(String data) {
        this.data = data;
        System.out.println("Change data and notify observers!");
        notifyObservers();
    }

    public String getData() {
        return this.data;
    }
}