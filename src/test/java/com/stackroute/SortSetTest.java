package com.stackroute;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortSetTest {
    Set<String> s=new TreeSet<>();
    Set<String> s1=new TreeSet<>();
    List<String> exp=new ArrayList<>(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"));
    List<String> exp1=new ArrayList<>(Arrays.asList("Bluto","Alice","Eugene","Harry","Olive"));
    @Test
    public void testsortSet()
    {
        s.add("Harry");
        s.add("Olive");
        s.add("Alice");
        s.add("Bluto");
        s.add("Eugene");
        SortSet sort=new SortSet(s);
        assertEquals(exp,sort.sortSet());

    }
    @Test
    public void testsortSetFailure()
    {
        s1.add("Harry");
        s1.add("Olive");
        s1.add("Alice");
        s1.add("Bluto");
        s1.add("Eugene");
        SortSet test1=new SortSet(s1);
        assertNotEquals(exp1,test1.sortSet());

    }
}
