package com.chuan.design_patterns.bridge;

import com.chuan.design_patterns.bridge.abstraction.Abstraction;
import com.chuan.design_patterns.bridge.abstraction.RefinedAbstractionB;
import com.chuan.design_patterns.bridge.abstraction.RefinedAbstractionA;
import com.chuan.design_patterns.bridge.implementation.ConcreteImplementorA;
import com.chuan.design_patterns.bridge.implementation.ConcreteImplementorB;
import com.chuan.design_patterns.bridge.implementation.Implementor;

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
