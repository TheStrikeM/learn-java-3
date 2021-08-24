package com.thestrikem.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Entity {
    private String name;
    private int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return age == entity.age && Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Test1 {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        entities.add(new Entity("Gena", 10));
        entities.add(new Entity("Lena", 13));
        entities.add(new Entity("ena", 12));
        System.out.println(Test1.filterByAge(entities));
    }

    public static <T extends Entity> List<T> filterByAge(List<T> entities) {
        Collections.sort(entities, (a, b) -> a.getAge() - b.getAge());
        return entities;
    }
}
