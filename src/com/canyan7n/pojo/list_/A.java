package com.canyan7n.pojo.list_;

import java.util.Objects;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/7 23:06
 */
public class A {

    public A(String aName, int aAge) {
        this.aName = aName;
        this.aAge = aAge;
    }

    private String aName;

    private int aAge;

    /*
        重写equals和hashcode
        勾选的属性表示
        如果这些勾选属性相同，则equals为真， hashcode同理
         */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return aAge == a.aAge && Objects.equals(aName, a.aName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aName, aAge);
    }
}
