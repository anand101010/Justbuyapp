package com.bezkoder.spring.datajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Data
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "user")
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long user_id;

        @Column(name = "username")
        private String username;

        @Column(name = "city")
        private String city;

        @Column(name = "state")
        private String state;

        @Column(name = "country")
        private String country;

        @Column(name = "pincode")
        private int  pincode;




    }

