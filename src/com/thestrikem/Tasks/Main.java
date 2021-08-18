package com.thestrikem;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Main.testFunc();
        System.out.println(Main.isIsogram("item"));
    }

    public static String maskify(String input) {
        if (input.length() <= 4) return input;
        StringBuilder inputBuilder = new StringBuilder(input);
        int requiredEncryptItems = input.length() - 5;

        while (requiredEncryptItems >= 0) {
            inputBuilder.setCharAt(requiredEncryptItems, '#');
            requiredEncryptItems--;
        }
        return inputBuilder.toString();
    }

    public static int getVowelsCount(String input) {
        String vowels = "aeiou";
        int totalVowels = 0;
        for (char item : input.toCharArray()) {
            if (vowels.indexOf(item) != -1) { totalVowels++; }
        }
        return totalVowels;
    }

    public static boolean isValidBraces(String input) {
        List<Character> tracer = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char inputValue = input.charAt(i);
            if (inputValue == '(' || inputValue == '[' || inputValue == '{') {
                tracer.add(input.charAt(i));
            } else {
                if (tracer.size() == 0) { return false; }
                char lastValue = tracer.get(tracer.size() - 1);
                if ((inputValue == ')' && lastValue == '(') || (inputValue == '}' && lastValue == '{') || (inputValue == ']' && lastValue == '[')) {
                    tracer.remove(tracer.size() - 1);
                }
            }
        }
        return tracer.size() == 0;
    }

    public static String getLikeMessage(String... names) {
        if (names.length == 0) return "no one likes this";
        else if (names.length == 1) return names[0] + " likes this";
        else if (names.length == 2) return names[0] + " and " + names[1] + " like this";
        else if (names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else if (names.length >= 4) return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
        return "";
    }

    public static String getLikeMessageAdvanced(String... names) {
        enum Messages {
            NO_PERSON_LIKE,
            ONE_PERSON_LIKE,
            TWO_PERSON_LIKE,
            THREE_PERSON_LIKE,
            LOT_PERSON_LIKE
        }

        HashMap<Messages, String> messageMap = new HashMap<>();
        messageMap.put(Messages.NO_PERSON_LIKE, "no one likes this");
        messageMap.put(Messages.ONE_PERSON_LIKE, "%s likes this");
        messageMap.put(Messages.TWO_PERSON_LIKE, "%s and %s like this");
        messageMap.put(Messages.THREE_PERSON_LIKE, "%s, %s and %s like this");
        messageMap.put(Messages.LOT_PERSON_LIKE, "%s, %s and %d others like this");

        switch (names.length) {
            case 0: return messageMap.get(Messages.NO_PERSON_LIKE);
            case 1: return String.format(messageMap.get(Messages.ONE_PERSON_LIKE), names[0]);
            case 2: return String.format(messageMap.get(Messages.TWO_PERSON_LIKE), names[0], names[1]);
            case 3: return String.format(messageMap.get(Messages.THREE_PERSON_LIKE), names[0], names[1], names[2]);
            default: return String.format(messageMap.get(Messages.LOT_PERSON_LIKE), names[0], names[1], names.length-2);
        }
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;
        String[] phraseArray = phrase.split(" ");
        String finalResult = "";
        for (int i = 0; i < phraseArray.length; i++) {
            phraseArray[i] = phraseArray[i].substring(0, 1).toUpperCase() + phraseArray[i].substring(1);
            finalResult += phraseArray[i] + (i != (phraseArray.length-1) ? " " : "");
        }
        return finalResult;
    }

    public static int getSumOfNumber(int n) {
        char[] numbersChar = String.valueOf(n).toCharArray();
        int finalResult = 0;
        for ( char number : numbersChar ) {
            finalResult += Character.getNumericValue(number);
        }
        if (String.valueOf(finalResult).length() >= 2) return getSumOfNumber(finalResult);
        return finalResult;
    }

    public static boolean isIsogram(String str) {
        List<String> tracer = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String item = String.valueOf(str.charAt(i)).toUpperCase();
            if (tracer.indexOf(item) != -1) return false;
            tracer.add(item);
        }
        return true;
    }

    public static void testFunc() {
        List<Character> tracer = new ArrayList<>();
        tracer.add('1');
        System.out.println(tracer.indexOf('6'));
    }
}
