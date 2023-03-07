package com.canyan7n.list;

import java.nio.file.LinkOption;
import java.util.LinkedList;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 10:00
 */
public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(101);

        linkedList.add(102);
        linkedList.add(102);

        linkedList.remove();
        linkedList.removeLast();
        System.out.println(linkedList.get(0));

    }
}
