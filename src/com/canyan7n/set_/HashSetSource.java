package com.canyan7n.set_;

import com.canyan7n.pojo.A;

import java.util.HashSet;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 20:02
 */
public class HashSetSource {

    public static void main(String[] args) {
//        HashSet hashSet = new HashSet();
//        hashSet.add("jack");
//        System.out.println(hashSet);

        /*
        扩容 到达临界值就扩容,没一次add成功都是一次添加，无论是数组上还是链表上
         */
//        HashSet hashSet1 = new HashSet();
//        for (int i = 0; i < 65; i++) {
//            hashSet1.add(i + 1);
//        }


        /*
        转化为红黑树
         */
        HashSet hashset2 = new HashSet();
        for (int i = 1; i <= 12; i++) {
            hashset2.add(new A(i));
        }
    }
}
