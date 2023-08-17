package com.bezkoder.spring.datajpa.Service;

import com.bezkoder.spring.datajpa.model.Orders;
import com.bezkoder.spring.datajpa.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PaymentService {
    Payment savePayment(Payment payment);
    List<Payment> GetAllpayment();

}
