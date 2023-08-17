package com.bezkoder.spring.datajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
    @Data
    @Entity
    @Table(name = "orders")
    @NoArgsConstructor
    @AllArgsConstructor
    public class Orders {
        @Id
        @NotNull
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long order_id;
        @Column(name = "order_price")
        private float order_price ;
        @Column(name = "order_address")
        private String order_address ;


        @Column(name = "order_status")
        private String  order_status ;



        @OneToOne
        @JoinColumn(name = "product_id")
        @JsonIgnoreProperties("orders")
        private Product product;

        @OneToOne
        @JoinColumn(name="user_id")
        @JsonIgnoreProperties("orders")
        private User user;

}
