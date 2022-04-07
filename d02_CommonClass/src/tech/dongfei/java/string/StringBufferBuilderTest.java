package tech.dongfei.java.string;

import org.junit.Test;

/**
 * StringBuffer: 可变的字符序列，线程安全的
 * StringBuilderTest: 可变的字符序列，线程不安全，效率高
 */

public class StringBufferBuilderTest {

    @Test
    public void test1(){
        StringBuffer str1 = new StringBuffer("abc");
        str1.setCharAt(0,'d');
        System.out.println(str1);
        System.out.println(str1.length());
    }

    @Test
    public void test2(){
        StringBuilder def = new StringBuilder("def");
        System.out.println(def);
    }

}
