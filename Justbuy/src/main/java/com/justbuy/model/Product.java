package com.justbuy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="product_id")
    private int product_id;
    @Column(name ="product_price")
    private float product_price;
    @Column(name="product_name")
    private  String product_name;

    @Lob
    @Column(name ="product_image")
    private byte[] product_image;

}
