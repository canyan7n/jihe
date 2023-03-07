package com.canyan7n.pojo;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 22:41
 * test for HashSetSource
 */
public class A {

    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
