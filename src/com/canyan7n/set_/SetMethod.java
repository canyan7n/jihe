package com.canyan7n.set_;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 10:31
 */
public class SetMethod {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add(101);
        hashSet.add(102);
        hashSet.add(null);
        hashSet.add(103);

        System.out.println(hashSet.hashCode());
        hashSet.remove(101);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next.hashCode());
        }
    }
}
