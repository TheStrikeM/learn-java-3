package com.thestrikem.List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(ArrayListUtil.sumAllItems(integerList));
        System.out.println(ArrayListUtil.firstElement(integerList));
        System.out.println(ArrayListUtil.lastElement(integerList));
    }

//    bad algorithm
    public static boolean isPalindromeBad(String message) {
        List<Character> listMessages = new LinkedList<>();
        for (char item : message.toCharArray()) {
            listMessages.add(item);
        }

        ListIterator<Character> iterator = listMessages.listIterator();
        ListIterator<Character> reverseIterator = listMessages.listIterator(listMessages.size());

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) return false;
        }
        return true;
    }

//    too bad algorithm
    public static boolean isPalindrome(String message) {
        List<String> messagesList = Arrays.asList(message.split(""));
        Collections.reverse(messagesList);
        return messagesList.toString().equals(Arrays.asList(message.split("")).toString());
    }
}

class ArrayListUtil {
    public static <T> T replace(List<T> arrayList, T initialItem, T itemToReplace) {
        return arrayList.set(arrayList.indexOf(initialItem), itemToReplace);
    }

    public static int sumAllItems(List<Integer> arrayList) {
        int finalResult = 0;
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            finalResult += listIterator.next();
        }
        return finalResult;
    }

    public static <T> T firstElement(List<T> arrayList) {
        return arrayList.get(0);
    }

    public static <T> T lastElement(List<T> arrayList) {
        return arrayList.get(arrayList.size()-1);
    }

    public static <T> boolean concat(List<T> arrayList, List<T> listToConcat) {
        return arrayList.addAll(listToConcat);
    }

    public static <T> void printAllItems(List<T> arrayList) {
        Iterator<T> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
