package com.stackroute;
import java.util.HashMap;
import java.util.Map;

public class Mapping {
    private Map<String,String> m;
    Mapping(Map<String,String> m) {
        this.m=m;
    }
    public Map<String,String> mapping(){
        String val = this.m.get("val1");
        if(!val.equals("")){
            this.m.put("val2",this.m.get("val1"));
            this.m.put("val1"," ");
        }
        return this.m;
    }
}
