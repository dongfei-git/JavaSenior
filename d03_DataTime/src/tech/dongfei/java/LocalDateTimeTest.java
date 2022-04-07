package tech.dongfei.java;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalData
 * LocalTime
 * LocalDataTime
 */

public class LocalDateTimeTest {

    @Test
    public void test1(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(2022, 3, 31, 23, 1);
        System.out.println(dateTime2);
        System.out.println(dateTime2.getDayOfWeek());

    }
}
