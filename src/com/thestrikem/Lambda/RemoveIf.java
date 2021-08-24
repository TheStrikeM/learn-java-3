package com.thestrikem.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(9);
        numberList.add(8);
        numberList.add(7);
        numberList.removeIf(number -> number<9);
        System.out.println(numberList);
    }

}
