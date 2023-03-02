package com.canyan7n.pojo;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 12:20
 * collection测试对象
 */
public class Book {

    public Book(String bName, String bAutor, Integer bPrice) {
        this.bName = bName;
        this.bAutor = bAutor;
        this.bPrice = bPrice;
    }

    private String bName;

    private String bAutor;

    private Integer bPrice;

    public Integer getbPrice() {
        return bPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bAutor='" + bAutor + '\'' +
                ", bPrice=" + bPrice +
                '}';
    }
}
