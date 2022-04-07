package tech.dongfei.java;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历类
 */

public class CalendarTest {
    @Test
    public void test1(){
        GregorianCalendar calendar = new GregorianCalendar();
        // 常用方法
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //当前是这个月的第几天

        calendar.set(Calendar.DAY_OF_MONTH,22);  //设置为22
        calendar.add(Calendar.DAY_OF_MONTH,3); //加3天

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
