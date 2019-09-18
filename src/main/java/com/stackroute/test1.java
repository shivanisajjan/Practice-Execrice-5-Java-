package com.stackroute;

import java.util.Scanner;
interface allUpper{
    String upperCase();
}
interface findSubtext{
    String subtext(int i1,int i2);
    String Delete(String str,String subStr);
}
abstract class Delete implements findSubtext{
    public String Delete(String string,String word){
        if (string.contains(word)) {
            // To cover the case
            // if the word is at the
            // beginning of the string
            // or anywhere in the middle
            String tempWord = word + " ";
            string = string.replaceAll(tempWord, "");

            // To cover the edge case
            // if the word is at the
            // end of the string
            tempWord = " " + word;
            string = string.replaceAll(tempWord, "");
        }

        // Return the resultant string
        return string;
        }
}
class text extends Delete implements allUpper{
    String text;
    String author;
    int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String upperCase() {
        String s=this.text.toUpperCase();
        return s;
    }

    @Override
    public String subtext(int firstIndex,int lastIndex) {
        String s1=this.text.substring(firstIndex,lastIndex);
        String s2=Delete(this.text,s1);
        return s2;
    }
}
public class test1 {
    public static void main(String[] args){
        String s1="quick brown fox jumps over the lazy dog";
        text t=new text();
        t.setText(s1);
        String s=t.upperCase();
        Scanner sc=new Scanner(System.in);
        int firstIndex=sc.nextInt();
        int lastIndex=sc.nextInt();
        String s6=t.subtext(firstIndex,lastIndex);
        System.out.println(s);
        System.out.println(s6);
    }
}

