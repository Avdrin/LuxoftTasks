package com.howtodoinjava.jersey;

import java.math.BigDecimal;

/**
 * Created by Katz on 07.04.2017.
 */
//class Item {
//    Object key;
//    Object value;
//
//    Item(Object k, Object v, BigDecimal bigDecimal) {
//        key = k;
//        value = v;
//    }
//}

public class Item {

    private String name;
    private int qty;
    private BigDecimal price;

    public Item(String apple, int i, BigDecimal bigDecimal) {
this.name = apple;
this.qty = i;
this.price = bigDecimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public BigDecimal getPrice() {
        return price;
    }
//constructors, getter/setters
}