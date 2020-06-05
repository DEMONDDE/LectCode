package org;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    Work1 work1 = new Work1();
    @Test
    public void test1(){
        String s = "aa3[a]ef";
       String a =  work1.decodeString(s);
       System.out.println(a);
    }
}
