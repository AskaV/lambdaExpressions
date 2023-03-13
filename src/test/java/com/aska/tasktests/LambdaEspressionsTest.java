package com.aska.tasktests;

import jdk.jfr.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.*;

@Description("Write functional programming lambda expressions using Java 8 streams. " +
             "Each task must be solved with one lambda expressions. Put lambda expressions in the return statement.")
public class LambdaEspressionsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @Description("Hello Test")
    public void zebraAgentTest() {
        LOGGER.info("Hello World!");
    }

    @Test
    @Description("Get a new sequence of strings with more than one character from the stringList, starting and ending with C")
    public void testFilterByFirstAndLastCharacter() {
        List<String> list = Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a");
        Assert.assertEquals(LambdaExpressions.filterByFirstAndLastCharacter("a", list), Arrays.asList("asda", "asdfa"));
    }

    @Test
    @Description("Get a sequence of ascending sorted integer values equal to the lengths of the strings included in the stringList sequence. ")
    public void testSortedIntegerValuesOfStringsList() {
        List<String> list = Arrays.asList("Hello", "world", "!", "Good", "morning", "!");
        Assert.assertEquals(LambdaExpressions.sortByIntegerValuesOfStringsList(list), Arrays.asList(1, 1, 4, 5, 5, 7));
    }

    @Test
    @Description("Get a new sequence of strings, where each string consists of the first and last characters of the corresponding string in the stringList sequence.")
    public void testSplitFirstAndLastLetterOfWord() {
        List<String> list = Arrays.asList("asd", "a", "basdw");
        Assert.assertEquals(LambdaExpressions.splitFirstAndLastLetterOfWord(list), Arrays.asList("ad", "aa", "bw"));
    }

    @Test
    @Description("Get from stringList all strings of length K ending in a digit and sort them in ascending order.")
    public void testAscendingSortedListOfFixedLenghtThatEndDigit() {
        List<String> list = Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");
        Assert.assertEquals(LambdaExpressions.testAscendingSortedListOfFixedLenghtThatEndDigit(2, list), Arrays.asList("A1", "S3"));
    }

    @Test
    @Description("Get sequence of string representations of only odd integerList values and sort in ascending order.")
    public void testOddIntSortedList() {
        List<Integer> list = Arrays.asList(1, 2, 5, 4, 3, 6);
        Assert.assertEquals(LambdaExpressions.testOddIntSortedList(list), Arrays.asList(1, 3, 5));
    }
}