package tech.dongfei.java.string;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTest02 {

    /**
     * String与基本数据类型和包装的类的转换
     */
    @Test
    public void test1(){
        String str1 = "123";
        int num = Integer.parseInt(str1);
        System.out.println(num);

        String str2 = String.valueOf(num);
        System.out.println(str2);
    }

    /**
     * String与char[]之间的转换
     */
    @Test
    public void test2(){
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        String str2 = new String(charArray);
        System.out.println(str2);
    }

    /**
     * String与byte[]之间的转换
     */
    @Test
    public void test3(){
        String str2 = "abcdqwe123中国";
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);  //编码
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        String string = Arrays.toString(bytes);
        System.out.println(string);

        String str3 = new String(bytes,StandardCharsets.UTF_8);  //解码
        System.out.println(str3);
    }

}
