package com.thestrikem.Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> employers = new ArrayList<>();

        Employee emp1 = new Employee(2, "Genadiy", "Petrovich", 120000);
        Employee emp2 = new Employee(1, "Vasiliy", "Petrovich", 190000);
        Employee emp3 = new Employee(6, "Timofey", "Petrovich", 40000);

        employers.add(emp1);
        employers.add(emp2);
        employers.add(emp3);

        System.out.println(String.format("Before sorting: \n %s", employers));
        Collections.sort(employers);
        System.out.println(String.format("After sorting: \n %s", employers));
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee with id %s", this.id);
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.id == anotherEmployee.id) return 0;
        else if (this.id < anotherEmployee.id) return -1;
        else return 1;
    }
}
