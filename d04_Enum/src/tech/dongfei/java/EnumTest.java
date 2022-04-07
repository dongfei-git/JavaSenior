package tech.dongfei.java;

import org.junit.Test;

/**
 * 枚举类, jdk1.5之前
 */

//自定义枚举类
class Season{
    private final String seasonName;
    private final String seasonDesc;

    //私有化类的构造器
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供当前枚举类的多个对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","白雪皑皑");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}


public class EnumTest {
    @Test
    public void test1(){
        Season autumn = Season.AUTUMN;
        String seasonName = autumn.getSeasonName();
        String seasonDesc = autumn.getSeasonDesc();
        System.out.println(seasonName);
        System.out.println(seasonDesc);
    }
}
