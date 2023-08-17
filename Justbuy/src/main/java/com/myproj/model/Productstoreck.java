package com.bezkoder.spring.datajpa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Productstoreck implements Serializable {


    @Column(name="product_id")
     int product_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productstoreck that = (Productstoreck) o;
        return product_id == that.product_id && store_id == that.store_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, store_id);
    }

    @Column(name = "store_id")
    int store_id;

}
