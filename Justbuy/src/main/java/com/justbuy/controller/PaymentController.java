package com.justbuy.controller;

import com.justbuy.Service.PaymentService;
import com.justbuy.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment/api")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;



    @PostMapping("/savepayment")
    public ResponseEntity<Payment> savePayment(@RequestBody Payment payment) {
        return new ResponseEntity<Payment>(paymentService.savePayment(payment), HttpStatus.ACCEPTED);
    }
    @GetMapping("/getallpayment")
    public List<Payment>getAllPayment(){
        return  paymentService.GetAllpayment();
    }
}
