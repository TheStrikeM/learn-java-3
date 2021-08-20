package com.thestrikem.HashCodeAndEquals;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        new Main().testFunc();
    }

    public void testFunc() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("item", "This is map with item");
        System.out.println(hashMap.get("This is map with item"));
    }
}
