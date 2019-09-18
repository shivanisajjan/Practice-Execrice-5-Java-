package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UpdateArray {
    List<String > li=new ArrayList<>();
    public UpdateArray(List<String> li) {
        this.li=li;
    }
    public List<String> updateArray(String s1,String s2){
        for(int i=0;i<this.li.size();i++){
            if(this.li.get(i).equals(s1)){
                this.li.set(i,s2);
            }
        }
        return this.li;
    }
}
