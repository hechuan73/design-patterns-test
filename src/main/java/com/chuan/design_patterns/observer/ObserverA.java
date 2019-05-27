package com.chuan.design_patterns.observer;

public class ObserverA implements IObserver {
    @Override
    public void update(IObservable o, Object arg) {
        // Object data = ((ObservableA) o).getData();
        System.out.println("Data is changed to " + arg);
    }
}
