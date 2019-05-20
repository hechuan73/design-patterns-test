package com.chuan.bridge;

import com.chuan.bridge.abstraction.Abstraction;
import com.chuan.bridge.abstraction.RefinedAbstractionB;
import com.chuan.bridge.abstraction.RefinedAbstractionA;
import com.chuan.bridge.implementation.ConcreteImplementorA;
import com.chuan.bridge.implementation.ConcreteImplementorB;
import com.chuan.bridge.implementation.Implementor;

public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstractionA(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction = new RefinedAbstractionB(implementor);
        abstraction.operation();
    }
}
