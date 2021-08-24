package com.thestrikem.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) {
        List<SomeEntity> ourEntities = createThreeEntities(() ->
                new SomeEntity("Gena", 200));
        changeEntity(ourEntities.get(0), (entity) -> {
            entity.age = 600;
            entity.name = "Old Gena";
        });
        ourEntities.forEach(entity -> System.out.println("Hello " + entity.name + "!" + " Your age is " + entity.age + "?"));
        System.out.println(avgOfSmth(ourEntities, (SomeEntity entity) -> Double.valueOf(entity.age)));
    }

    private static <T> List<T> createThreeEntities(Supplier<T> entitySupplier) {
        List<T> someEntities = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            someEntities.add(entitySupplier.get());
        }
        return someEntities;
    }

    private static <T> void changeEntity(T entity, Consumer<T> entityConsumer) {
        entityConsumer.accept(entity);
    }

    private static <T> double avgOfSmth(List<T> entities, Function<T, Double> f) {
        double result = 0;
        for (T entity : entities) {
            result += f.apply(entity);
        }
        return result/entities.size();
    }
}

class SomeEntity {
    String name;
    int age;

    public SomeEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SomeEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
