package com.canyan7n.set_;

import com.canyan7n.pojo.set_.Employee;
import com.canyan7n.pojo.set_.Mybrith;

import java.util.HashSet;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/10 19:57
 */
public class HashSetEx02 {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee employee1 = new Employee("jack","10000",new Mybrith(2000,10,10));
        Employee employee2 = new Employee("tom","12000",new Mybrith(2001,9,9));
        Employee employee3 = new Employee("jack","13000",new Mybrith(2000,10,10));
        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
//        System.out.println(hashSet);
        for (Object o: hashSet){
            System.out.println("hashset=" + o);
        }
    }

}
