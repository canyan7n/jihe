package com.canyan7n.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 12:21
 */
public class Collection01 {
    public static void main(String[] args) {
        crud();
    }

    public static void crud(){
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("rose");

        System.out.println(list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object o =  iterator.next();
            System.out.println(o);
        }

        list.remove(0);
        list.remove("tom");
        System.out.println("-----------");
        for (Object o : list){
            System.out.println(o);
        }
    }
}
