package tech.dongfei.java;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {
    @Test
    public void test1(){
        long timeMillis = System.currentTimeMillis();  //时间戳
        System.out.println(timeMillis);
    }

    /**
     * Data类
     */
    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime()); //时间戳，毫秒

        java.sql.Date date2 = new java.sql.Date(date.getTime());
        System.out.println(date2);
    }
}
