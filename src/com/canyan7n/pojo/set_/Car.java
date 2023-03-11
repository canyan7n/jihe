package com.canyan7n.pojo.set_;

import java.util.Objects;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/10 23:50
 * test for linkedhashsetEx01
 */
public class Car {

    private String name;

    private String price;

    public Car() {
    }

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
