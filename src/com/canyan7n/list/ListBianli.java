package com.canyan7n.list;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 13:37
 */
public class ListBianli {

    public static void main(String[] args) {
        List list = new Vector();
        list.add("tom");
        list.add("jack");
        list.add("天龙八部");
        list.add("小炒肉");

        //1. iterator
        System.out.println("----迭代器----");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o1 =  iterator.next();
            System.out.println("list=" + o1);
        }

        //2. 增强for
        System.out.println("----增强for----");
        for(Object o2 : list){
            System.out.println(o2);
        }

        //3. 普通for
        System.out.println("----普通for----");
        for (int i = 0; i < list.size(); i++) {
            Object o3 = list.get(i);
            System.out.println(o3);
        }
    }
}
