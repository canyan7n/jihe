package com.canyan7n.set_;

import com.canyan7n.pojo.Node;

import java.util.HashSet;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 11:06
 * 模拟hashset的底层
 */
public class HashSetStructure {

    public static void main(String[] args) {

        Node[] table = new Node[10];

        Node john = new Node("john", null);
        table[2] = john;// 将john放在table索引为2的位置

        Node jack = new Node("jack", null);
        john.next = jack;// 将jack放在jack的后面


        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table=" + table);

    }
}
