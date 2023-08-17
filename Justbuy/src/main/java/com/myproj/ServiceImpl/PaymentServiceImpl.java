package com.bezkoder.spring.datajpa.ServiceImpl;

import com.bezkoder.spring.datajpa.Exception.NotFoundException;
import com.bezkoder.spring.datajpa.Service.PaymentService;
import com.bezkoder.spring.datajpa.model.Payment;
import com.bezkoder.spring.datajpa.repository.PaymentRepository;
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
