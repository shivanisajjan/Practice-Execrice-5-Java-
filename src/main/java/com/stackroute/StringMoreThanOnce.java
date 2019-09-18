package com.stackroute;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringMoreThanOnce {
    private String[] s1;
    public StringMoreThanOnce(String[] s1) {
        this.s1=s1;
    }

    public Map<String,Boolean> wordCheck() {
        Map<String,Boolean> m=new HashMap<>();
        for(String s:s1){
            if(m.containsKey(s)){
                m.put(s, true);
            }
            else{
                m.put(s,false);
            }
        }
        return m;
    }
}
