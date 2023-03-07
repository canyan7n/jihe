package com.canyan7n.pojo;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 11:22
 * for HashSetStructure
 */
public class Node {

    public Object nName;

    public Node next;

    public Node(Object nName, Node next) {
        this.nName = nName;
        this.next = next;
    }
}
