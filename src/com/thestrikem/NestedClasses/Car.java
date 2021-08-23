package com.thestrikem.NestedClasses;

//static nested class
public class Car {
    private String name;
    private int doorCount;
    private Engine engine;

    public Car(String name, int doorCount, Engine engine) {
        this.name = name;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", doors=" + doorCount +
                ", engine=" + engine +
                '}';
    }

//    static
    public static class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public void start() {
            System.out.println("Engine success started");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(50);
        engine.start();
        Car car = new Car("BMW", 2, new Car.Engine(500));
        car.getEngine().start();
    }
}
