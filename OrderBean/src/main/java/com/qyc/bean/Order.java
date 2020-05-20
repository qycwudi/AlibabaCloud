package com.qyc.bean;

import java.io.Serializable;

/**
 * @author qyc
 * @time 2020/5/14 - 11:09
 */

public class Order implements Serializable {

    private int id;
    private String number;

    public Order() {
    }

    public Order(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}