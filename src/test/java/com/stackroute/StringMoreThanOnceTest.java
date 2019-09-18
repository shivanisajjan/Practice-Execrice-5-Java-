package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import java.util.function.BinaryOperator;

import static org.junit.Assert.*;

public class StringMoreThanOnceTest {
    private static StringMoreThanOnce stringMoreThanOnce;

    @BeforeClass
    public static void setup() {
        String[] s1={"a","b","c","d","a","c","c"};
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stringMoreThanOnce=new StringMoreThanOnce(s1);
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        stringMoreThanOnce = null;
    }

    @Test
    public void testwordCheck()
    {
        Map<String, Boolean> exp=new HashMap<>();
        exp.put("a",true);
        exp.put("b",false);
        exp.put("c",true);
        exp.put("d",false);
        assertEquals(exp,stringMoreThanOnce.wordCheck());

    }
    @Test
    public void testwordCheckFailure()
    {
        Map<String,Boolean> exp1=new HashMap<>();
        exp1.put("a",false);
        exp1.put("b",false);
        exp1.put("c",true);
        exp1.put("d",false);
        assertNotEquals(exp1,stringMoreThanOnce.wordCheck());

    }
}
