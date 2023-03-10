package com.canyan7n.pojo.set_;

import java.util.Collection;
import java.util.Objects;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/10 19:57
 * test for HashSetEx02
 */
public class Employee {

    private String name;

    private String sal;

    private Mybrith birth;

    public Employee() {
    }

    public Employee(String name, String sal, Mybrith birth) {
        this.name = name;
        this.sal = sal;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birth=" + birth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Mybrith getBirth() {
        return birth;
    }

    public void setBirth(Mybrith birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && birth.equals(employee.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birth);
    }
}
