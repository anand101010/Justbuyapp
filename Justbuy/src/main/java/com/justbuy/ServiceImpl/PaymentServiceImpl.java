package com.justbuy.ServiceImpl;

import com.justbuy.Exception.NotFoundException;
import com.justbuy.Service.PaymentService;
import com.justbuy.model.Payment;
import com.justbuy.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
   @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> GetAllpayment() {
        if (paymentRepository.findAll().isEmpty()){throw new NotFoundException("The payments Are Empty");}
        return paymentRepository.findAll();
    }
}
