package com.canyan7n.list;

import com.canyan7n.pojo.Book;

import java.util.*;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/2 13:41
 */
public class ListExercise2 {

    public static void main(String[] args) {

        Book book1 = new Book("天龙八部", "小天", 100);
        Book book2 = new Book("细节决定成败", "小细", 200);
        Book book3 = new Book("曾国潘", "小曾", 150);

//        List list1 = new ArrayList();
        List list1 = new Vector();
//        List list1 = new LinkedList();
        list1.add(book1);
        list1.add(book2);
        list1.add(book3);

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("book=" + next);
        }

        sort(list1);

        System.out.println(list1);
    }

    public static void sort(List list){
        //冒泡排序 小到大
//        int list1Size = list.size();
//        for (int i = 0; i < list1Size - 1; i++) {
//            for (int j = 0; j < list1Size - 1 - i; j++) {
//                Book bookj = (Book) list.get(i);
//                Book bookj1 = (Book) list.get(j + 1);
//                if(bookj.getbPrice() > bookj1.getbPrice()){
//                    list.set(j,bookj1);
//                    list.set(j+1,bookj);
//                }
//            }
//        }

        //冒泡排序 大到小
        int list1Size = list.size();
        for (int i = 0; i < list1Size - 1; i++) {
            for (int j = i; j < list1Size - 1; j++) {
                Book bookj = (Book) list.get(i);
                Book bookj1 = (Book) list.get(j + 1);
                if(bookj.getbPrice() < bookj1.getbPrice()){
                    list.set(j+1,bookj);
                    list.set(j,bookj1);
                }
            }
        }

    }
}
