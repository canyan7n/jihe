package com.canyan7n.list;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 13:03
 */
public class ListExercise {

    public static void main(String[] args) {

        List list = new ArrayList();

        for (int i = 0; i < 11; i++) {
            list.add("hello list" + i);
        }

        System.out.println("---for首次---");
        for(Object o : list){
            System.out.println(o);
        }

        list.set(9,"六赵");
        System.out.println("---修改---");
        System.out.println(list);

        System.out.println("---插入---");
        list.add(1,"篮球");
        System.out.println(list);

        System.out.println("---获取0---");
        Object o = list.get(0);
        System.out.println(o);

        System.out.println("---删除1---");
        Object remove = list.remove(1);
        System.out.println(remove);
        System.out.println("list=" + list);

        System.out.println("---迭代器---");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
    }
}
