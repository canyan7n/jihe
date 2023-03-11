package com.canyan7n.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/11 10:26
 */
public class HashMapSource {

    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("no01","张无忌");
        map.put("no02","张三丰");

        System.out.println(map);

        Set set = map.entrySet();
        for(Object obj :set){
            System.out.println(obj.getClass());
            Map.Entry entry= (Map.Entry)obj;
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
