package com.stackroute;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class MappingTest {
    @Test
    public void testmapping()
    {
        Map<String,String> m1=new HashMap<>();
        m1.put("val1","java");
        m1.put("val2","c++");
        Mapping test1=new Mapping(m1);
        Map<String,String> e1=new HashMap<>();
        e1.put("val1"," ");
        e1.put("val2","java");
        assertEquals(e1,test1.mapping());

    }
    @Test
    public void testmappingFailure()
    {
        Map<String,String> m2=new HashMap<>();
        m2.put("val1","mars");
        m2.put("val2","saturn");
        Mapping t2=new Mapping(m2);
        HashMap e2=new HashMap();
        e2.put("val1","mars");
        e2.put("val2","mars");
        assertNotEquals(e2,t2.mapping());

    }
}
