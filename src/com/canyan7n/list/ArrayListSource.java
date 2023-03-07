package com.canyan7n.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 19:56
 */
public class ArrayListSource {

    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }


        for (int i = 11; i <=15; i++) {
            list.add(i);
        }
        list.add("b");
        list.add("c");
        list.add(null);

        for (Object o : list){
            System.out.println(o);
        }
    }
}
