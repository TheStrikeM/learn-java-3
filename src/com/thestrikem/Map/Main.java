package com.thestrikem.Map;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Genadiy", 2);
        Student st2 = new Student("Genadiy", 2);
        Student st3 = new Student("Vasiliy", 2);

        HashMap<Student, Double> studentHashMap = new HashMap<>();
        studentHashMap.put(st1, 4.30);
        studentHashMap.put(st3, 5.30);
        System.out.println(studentHashMap);

        System.out.println(studentHashMap.containsKey(st2));
    }
}


final class Student {
    final String name;
    final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
