package com.thestrikem.Lambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Genadiy", 6));
        students.add(new Student("Vasiliy", 5));
        students.add(new Student("Gavriliy", 9));
        students.add(new Student("Feodisiya", 2));
        students.add(new Student("Ekaterina", 8));
        students.add(new Student("Ekaterina", 4));

        StudentsCheck studentsCheck = (Student student) -> student.getAvgGrade()<7 && student.getAvgGrade()>9;
        StudentsInfo.filterAndWrite(students, studentsCheck);
    }
}

class Student {
    private String name;
    private int avgGrade;

    public Student(String name, int avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return String.format("Student '%s' with average grade = %s", this.name, this.avgGrade);
    }

    public void writeToConsole() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }
}

class StudentsInfo {
    static void filterAndWrite(ArrayList<Student> students, StudentsCheck sc) {
        for (Student student : students) {
            if (sc.check(student)) student.writeToConsole();
        }
    }
}

interface StudentsCheck {
    boolean check(Student s);
}
