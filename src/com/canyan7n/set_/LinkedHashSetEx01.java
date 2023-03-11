package com.canyan7n.set_;

import com.canyan7n.pojo.set_.Car;

import java.util.LinkedHashSet;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/10 23:51
 */
public class LinkedHashSetEx01 {

    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥迪","10w"));
        linkedHashSet.add(new Car("宝马","20w"));
        linkedHashSet.add(new Car("宝马","20w"));
        System.out.println(linkedHashSet);
    }
}
