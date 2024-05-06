package com.justbuy.Service;

import com.justbuy.model.Payment;

import java.util.List;

public interface PaymentService {
    Payment savePayment(Payment payment);
    List<Payment> GetAllpayment();

}
