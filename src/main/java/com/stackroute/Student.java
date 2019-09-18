package com.stackroute;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private int age;
    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class StudentSorterbyage implements Comparator<Student>{
    public int compare(Student a, Student b) {
        int age= b.getAge()-a.getAge();
        if(age==0){
            int n=b.getName().compareTo(a.getName());
            if(n==0){
                return b.getId()-a.getId();
            }
            else {
                return n;
            }
        }
        else{
            return age;
        }
    }

}
class Maintest{
    public static List<Student> add(){
        Student s1=new Student(2,"Poorvi",21);
        Student s2=new Student(1,"Shivani",20);
        Student s3=new Student(4,"Deepak",22);
        Student s4=new Student(5,"Shivani",20);
        Student s5=new Student(3,"Hari Priya",21);
        List<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.sort(new StudentSorterbyage());
        return al;
    }
}
