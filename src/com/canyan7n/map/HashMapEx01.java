package com.canyan7n.map;

import com.canyan7n.pojo.map_.Employee;

import java.util.*;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/11 16:40
 */
public class HashMapEx01 {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "张三", 12000);
        Employee employee1 = new Employee(2, "李四", 15000);
        Employee employee2 = new Employee(3, "王五", 20000);

        Map map = new HashMap();
        map.put(employee.getId(),employee);
        map.put(employee1.getId(),employee1);
        map.put(employee2.getId(),employee2);
        System.out.println(map);

        Set keySet= map.keySet();
        Iterator iterator = keySet.iterator();
        Collection values = map.values();
        System.out.println("---for---");
        for(Object entry: map.entrySet()){
            Map.Entry m = (Map.Entry)entry;
            Employee e = (Employee)m.getValue();
            if (e.getSal() > 18000){
                System.out.println(m.getKey() + "-" + m.getValue());
            }
        }
        System.out.println("---迭代器---");
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee e = (Employee)map.get(key);
            if(e.getSal() > 18000){
                System.out.println(key + "-" + map.get(key));
            }
        }
    }
}
