package com.canyan7n.pojo;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 12:28
 * CollectionExercise测试类
 */
public class Dog {
    private String dName;

    private String dAge;

    public Dog() {
    }

    public Dog(String dName, String dAge) {
        this.dName = dName;
        this.dAge = dAge;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dName='" + dName + '\'' +
                ", dAge='" + dAge + '\'' +
                '}';
    }
}
