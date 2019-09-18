package com.stackroute;

import java.util.*;

public class SortSet {
    Set<String> s;
    SortSet(Set<String> s) {
        this.s=new TreeSet<>();
        this.s=s;
        System.out.println(this.s);
    }

    public List<String> sortSet() {
        List<String> li=new ArrayList<>();
        for (String x : this.s)
            li.add(x);
        return li;
    }
}
