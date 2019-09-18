package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {
    private static WordCount wordCount;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        String s1="one one -one___two,,three,one @three*one?two";
        wordCount=new WordCount(s1);
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wordCount = null;
    }

    @Test
    public void testwordCount()
    {
        Map<String,Integer> exp=new HashMap();
        exp.put("one",5);
        exp.put("two",2);
        exp.put("three",2);
        assertEquals(exp,wordCount.wordCount());

    }
    @Test
    public void testwordCountFailure()
    {
        Map<String,Integer> exp1=new HashMap();
        exp1.put("one",6);
        exp1.put("two",2);
        exp1.put("three",2);
        assertNotEquals(exp1,wordCount.wordCount());

    }
}
