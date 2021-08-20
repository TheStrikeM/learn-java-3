package com.thestrikem.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdvancedComparableTest {
    public static void main(String[] args) {
        List<GoldEmployee> goldEmployeesList = new ArrayList<>();

        GoldEmployee ge1 = new GoldEmployee(100, 20000);
        GoldEmployee ge2 = new GoldEmployee(101, 2000);
        GoldEmployee ge3 = new GoldEmployee(102, 60000);

        goldEmployeesList.add(ge1);
        goldEmployeesList.add(ge2);
        goldEmployeesList.add(ge3);
        Collections.sort(goldEmployeesList, new SalaryComparator());
        System.out.println(goldEmployeesList);
    }
}

class EmployeeDefault {
    Integer id;
    Integer salary;

    public EmployeeDefault(Integer id, Integer salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee with salary %s", this.salary);
    }
}

class GoldEmployee extends EmployeeDefault implements Comparable<GoldEmployee>
{

    public GoldEmployee(Integer id, Integer salary) {
        super(id, salary);
    }

    @Override
    public int compareTo(GoldEmployee anotherGoldEmployee) {
        return this.id.compareTo(anotherGoldEmployee.id);
    }
}

class SalaryComparator implements Comparator<GoldEmployee> {
    @Override
    public int compare(GoldEmployee emp1, GoldEmployee emp2) {
        return emp1.salary - emp2.salary;
    }
}
