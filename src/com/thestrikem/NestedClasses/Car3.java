package com.thestrikem.NestedClasses;

import java.util.Random;

//local inner class
public class Car3 {
    public static void main(String[] args) {
        new Car3().someMethod();
    }

    void someMethod() {
        class GetRandom {
            int a;

            public GetRandom(int a) {
                this.a = a;
            }

            public int getNumber() {
                return new Random().nextInt(a);
            }
        }

        GetRandom getRandom = new GetRandom(10);
        System.out.println(getRandom.getNumber());
    }

    void someMethod2() {
        
    }
}
