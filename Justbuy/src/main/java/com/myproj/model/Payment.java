package com.bezkoder.spring.datajpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    @Column(name = "card_no")
    private int card_no;
    @Column(name = "card_exp_date")
    private Date card_exp_date;
    @Column(name = "payment_status")
    private String payment_status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

}
