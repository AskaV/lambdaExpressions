package com.aska.tasktests;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class LambdaExpressions {

    public static Object filterByFirstAndLastCharacter(String letter, List<String> wordList) {
        return  wordList.stream().filter(str -> str.length() > 1 & str.startsWith(letter) & str.endsWith(letter)).collect(Collectors.toList());
    }

    public static Object sortByIntegerValuesOfStringsList(List<String> wordList) {
        return wordList.stream().map(str->str.length()).sorted().collect(Collectors.toList());
    }

    public static Object splitFirstAndLastLetterOfWord(List<String> wordList) {
        return wordList.stream().map(str-> String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1))).collect(Collectors.toList());
    }

    //        return list
    //                .stream()
    //                .filter(Objects::nonNull)
    //                .map(x -> x.charAt(0) + x.substring(x.length() - 1))
    //                .collect(Collectors.toList());

    public static Object testAscendingSortedListOfFixedLenghtThatEndDigit(int number, List<String> wordList) {
        return wordList.stream().filter(str -> str.length() == 2 & Character.isDigit(str.charAt(str.length()-1))).sorted().collect(Collectors.toList());
    }

    public static Object testOddIntSortedList(List<Integer> wordList) {
        return wordList.stream().filter(str -> str % 2 != 0).sorted().collect(Collectors.toList());
    }
}

//var n = wordList.stream().map(str-> String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length()-1))).collect(Collectors.toList());
//n.forEach(System.out::println);
