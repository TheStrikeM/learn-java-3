package com.thestrikem.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> someList = new ArrayList<>();
        someList.add("privet");
        someList.add("poka");
        someList.add("kak dela");

        System.out.println(Main.getMappedList(someList));
        System.out.println(Main.getFilteredList(someList));
    }

    private static <T extends String> List<Integer> getMappedList(List<T> someList) {
        return someList.stream().map(item -> item.length()).collect(Collectors.toList());
    }

    private static <T extends String> List<T> getFilteredList(List<T> someList) {
        return someList.stream().filter(el -> el.length() >= 6).collect(Collectors.toList());
    }
}
