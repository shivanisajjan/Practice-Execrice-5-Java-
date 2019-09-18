package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class UpdateArrayTest {
    private static UpdateArray t1;
    private static UpdateArray t2;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        t1 = null;
        t2 = null;
    }

    @Test
    public void testUpdateArray()
    {
        List<String> i1=new ArrayList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        t1=new UpdateArray(i1);
        assertEquals(Arrays.asList("Kiwi", "Grape", "Melon", "Berry"),t1.updateArray("Apple","Kiwi"));
        assertEquals(Arrays.asList("Kiwi", "Grape", "Mango", "Berry"),t1.updateArray("Melon","Mango"));
    }
//    @Test
//    public void testUpdateArrayFailure()
//    {
//        List<String> i2=new ArrayList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
//        t2=new UpdateArray(i2);
//        System.out.println(i2);
//        System.out.println(t2.updateArray("Apple","Kiwi"));
//        assertNotEquals(i2,t2.updateArray("Apple","Kiwi"));
//
//    }
}
