package tech.dongfei.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    @Test
    public void test1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();  //使用默认构造器
        Date date = new Date();

        String formatData = sdf.format(date);
        System.out.println(formatData);  // 22-3-30 下午11:46

        String str = "2020-01-09 上午11:30";
        Date parseData = sdf.parse(str);
        System.out.println(parseData);
    }

    @Test
    public void test2(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm:ss aaa");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }

}
