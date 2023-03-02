package com.canyan7n.collection;

import com.canyan7n.pojo.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 12:28
 * 创建三个Dog对象放入list中,用迭代器和增强for两种方式遍历
 */
public class CollectionExercise {

    public static void main(String[] args) {

        Dog dog1 = new Dog("狗1","11");
        Dog dog2 = new Dog("狗2","12");
        Dog dog3= new Dog("狗3","13");

        List list = new ArrayList();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object o =  iterator.next();
            System.out.println("dog= " + o);
        }

        for (Object o : list){
            System.out.println("dog=" + o);
        }
    }
}
