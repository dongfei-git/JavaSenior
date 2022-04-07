package tech.dongfei.java;

import org.junit.Test;

/**
 * 枚举类，jdk1.5之后
 */

enum Season2{
    //提供当前枚举类的多个对象
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");

    private final String seasonName;
    private final String seasonDesc;

    //私有化类的构造器
    private Season2(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}

public class EnumTest2 {
    @Test
    public void test2(){
        Season2 season2 = Season2.SPRING;
        System.out.println(season2.getSeasonName());
        System.out.println(season2.getSeasonDesc());

        // values方法
        Season2[] values = Season2.values();
        for (Season2 value : values) {
            System.out.println(value);
        }

        // valueOf方法
        Season2 autumn = Season2.valueOf("AUTUMN");
        System.out.println(autumn.getSeasonDesc());
        System.out.println(autumn.getSeasonName());
    }
}
