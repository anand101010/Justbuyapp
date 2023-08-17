package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
