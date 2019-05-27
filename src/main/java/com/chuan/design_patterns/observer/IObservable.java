package com.chuan.design_patterns.observer;

public interface IObservable {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
