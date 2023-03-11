package com.canyan7n.map;

import java.util.*;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/11 16:22
 * 遍历hashmap
 */
public class HashMapFor {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("No1","张三丰");
        map.put("No2","张无忌");
        map.put("No3","白眉鹰王");
        map.put("No1","张翠山");

        Set keySet = map.keySet();
        Collection values = map.values();
        System.out.println("----增强for第一种----");
        for(Object key : keySet){
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("----增强for第二种----");
        for(Object value : values){
            System.out.println(value);
        }
        System.out.println("----增强for第三种----");
        for(Object entry : map.entrySet()){
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m);
        }

        System.out.println("----itreator第一种----");
        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            Object key =  iterator1.next();
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("----itreator第二种----");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value =  iterator2.next();
            System.out.println(value);
        }
        System.out.println("----itreator第三种----");
        Iterator iterator3 = map.entrySet().iterator();
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m);
        }
    }
}

