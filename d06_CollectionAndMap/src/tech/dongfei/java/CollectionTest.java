package tech.dongfei.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("Abc");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());

        //获取长度
        System.out.println(coll.size());

        //addAll()方法，将coll2中的元素添加到coll中
        Collection coll2 = new ArrayList();
        coll2.add("hello");
        coll2.add("world");
        coll.addAll(coll2);
        for (Object o : coll) {
            System.out.println(o);
        }

        //清空集合
        coll.clear();

        //判断集合是否为空
        System.out.println(coll.isEmpty());
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add("Abc");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        coll.add(false);
        coll.add(new Person("张三",28));

        //判断集合中是否包含object
        boolean contains = coll.contains(123);
        System.out.println(contains);


    }

}
