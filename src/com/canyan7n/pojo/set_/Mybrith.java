package com.canyan7n.pojo.set_;

import java.util.Objects;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/10 19:58
 */
public class Mybrith {

    private int year;

    private int month;

    private int day;

    public Mybrith() {
    }

    public Mybrith(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mybrith{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mybrith mybrith = (Mybrith) o;
        return year == mybrith.year && month == mybrith.month && day == mybrith.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
