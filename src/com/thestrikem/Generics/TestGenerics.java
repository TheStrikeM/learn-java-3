package com.thestrikem.Generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("hello");
        testList.add("hello2");

        System.out.println(GenMethod.getFirstValue(testList));
    }
}

class GenMethod {
    public static <T> T getFirstValue(List<T> arrayList) {
        return arrayList.get(1);
    }
}
