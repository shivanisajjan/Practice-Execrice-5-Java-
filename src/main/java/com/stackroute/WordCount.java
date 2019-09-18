package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private String s1;
    public WordCount(String s1) {
        this.s1=s1;
    }

    public Map<String,Integer> wordCount() {
        Map<String,Integer> m=new HashMap<>();
        int count=0;
        String[] words=this.s1.trim().split(" |@|-|_|,|[*?]");
        for(String s:words) {
            if (!s.equals("")) {
                if (m.containsKey(s)) {
                    m.put(s, m.get(s) + 1);
                } else {
                    m.put(s, 1);
                }
            }
        }
        return m;
    }
}
