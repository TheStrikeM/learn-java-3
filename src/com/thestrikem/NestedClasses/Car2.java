package com.thestrikem.NestedClasses;

//inner nested class
public class Car2 {
    private String name;
    private int doorCount;
    private Engine engine;

    public Car2(String name, int doorCount, int horsePower) {
        this.name = name;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
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

    public class Engine {
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

class Test2 {
    public static void main(String[] args) {
        Car2 car = new Car2("BMW", 2, 500);
        car.getEngine().start();
    }
}
