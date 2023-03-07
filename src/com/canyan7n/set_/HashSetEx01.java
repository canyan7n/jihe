package com.canyan7n.set_;

import com.canyan7n.pojo.list_.A;

import java.util.HashSet;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 23:05
 */
public class HashSetEx01 {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new A("jack",18));
        hashSet.add(new A("jack",18));

        /*
        重写equals和hashcode
        勾选的属性表示
        如果这些属性相同，则equals为真
        hashcode同理
         */
        System.out.println(hashSet);
    }
}
