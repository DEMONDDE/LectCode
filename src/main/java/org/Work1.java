package org;

import java.util.HashMap;
import java.util.Map;

public class Work1 {
    public String decodeString(String s) {
        String a = "";
        char[] stack = new char[20];
        char[] chars = s.toCharArray();
        char word = ' ';
        int num;
        int p = 0;
        for(int i = 0; i < chars.length; i++){
            if(p == stack.length-1){
               a += stack.toString();
            }
            if(chars[i]<=57 && chars[i]>=49){
                if(p > 0){
                    a += becomeString(stack,p);
                    p = 0;
                }
            }
            if(chars[i] == ']'){
                while (p >= 0){
                    if(stack[p]>=97 && stack[p] <=122){
                        word = stack[p];
                    }
                    if(stack[p]<=57 && stack[p] >=49){
                        num = stack[p]-48;
                        a += becomeString(word,num);
                        break;
                    }
                    p--;
                }
            }
            stack[p] = chars[i];
            p++;
        }
        return a;
    }

    public String becomeString(char work, int num){
        char[] s = new char[num];
        for(int i = 0; i < num; i++){
            s[i]=work;
        }


        return String.valueOf(s);
    }

    public String becomeString(char[] stack,int p){
        char[] s = new char[p];
        for(int i = 0; i < p; i++){
            s[i]=stack[p];
        }
        return String.valueOf(s);
    }
}
