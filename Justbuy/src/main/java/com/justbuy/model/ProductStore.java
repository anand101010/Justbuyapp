package com.justbuy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_store")
public class ProductStore {

    @EmbeddedId
    Productstoreck id;

    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("store_id")
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "quantity")
    private int quantity;
}
