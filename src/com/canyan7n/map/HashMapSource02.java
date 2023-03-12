package com.canyan7n.map;

import java.util.HashMap;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/12 23:14
 */
public class HashMapSource02 {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        hashMap.put("java",10);
        hashMap.put("go",10);
        hashMap.put("java",20);

        System.out.println(hashMap);
    }
}
