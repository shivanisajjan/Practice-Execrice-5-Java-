package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    private static Student student;
    private static Student student1;
    private static Student student2;
    private static Student student3;
    private static Student student4;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        student=new Student(4,"Deepak",22);
        student1=new Student(2,"Poorvi",21);
        student2=new Student(3,"Hari Priya",21);
        student3=new Student(5,"Shivani",20);
        student4=new Student(1,"Shivani",20);

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        student = null;
        student1 = null;
        student2 = null;
        student3 = null;
        student4 = null;

    }


    @Test
    public void testStudent()
    {
        List<Student> li=new ArrayList<>();
        li.add(student);
        li.add(student1);
        li.add(student2);
        li.add(student3);
        li.add(student4);
        assertEquals(li.toString(),Maintest.add().toString());
    }
    @Test
    public void testStudent1()
    {
        List<Student> li=new ArrayList<>();
        li.add(student);
        li.add(student1);
        li.add(student2);
        li.add(student4);
        li.add(student3);
        assertNotEquals(li.toString(),Maintest.add().toString());
    }
    @Test
    public void testStudentFailure()
    {
        List<Student> li=new ArrayList<>();
        li.add(student);
        li.add(student1);
        li.add(student2);
        li.add(student3);
        li.add(student4);
        assertNotNull(li.toString(),Maintest.add().toString());
    }
}
