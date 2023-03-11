package com.canyan7n.pojo.map_;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/11 16:40
 * test for hashmapEx01
 */
public class Employee {

    private Integer id;

    private String name;

    private Integer sal;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
}
