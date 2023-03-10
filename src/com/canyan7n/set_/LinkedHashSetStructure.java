package com.canyan7n.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/10 23:01
 * linkedhashset 结构
 */
public class LinkedHashSetStructure {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        for (Object o : set){
            System.out.println("LinkedHastSet=" + o);
        }
    }
}
