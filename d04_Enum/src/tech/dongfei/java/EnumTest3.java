package tech.dongfei.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;

/**
 * 枚举类实现接口
 */

interface Info{
    void show();
}

enum Season3 implements Info{
    //提供当前枚举类的多个对象
    //在每个对象中分别实现接口的方法
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("chuntian");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("xiatian");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("qiutian");
        }
    },
    WINTER("冬天","白雪皑皑"){
        @Override
        public void show() {
            System.out.println("dongtian");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    //私有化类的构造器
    private Season3(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("是一个季节");
//    }
}

public class EnumTest3 {
    @Test
    public void test1(){
        Season3 season3 = Season3.SPRING;
        season3.show();

        Season3.WINTER.show();
    }
}
