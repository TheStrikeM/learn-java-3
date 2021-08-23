package com.thestrikem.NestedClasses;

public class Car4 {
    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public int someMethod(int a, int b) {
                return a+b;
            }
        };

        System.out.println(someInterface.someMethod(10,10));
    }
}

interface SomeInterface {
    int someMethod(int a, int b);
}
