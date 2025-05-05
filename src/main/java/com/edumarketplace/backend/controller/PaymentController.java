package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Payment;
import com.edumarketplace.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class PaymentController {

    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("payment")
    public Payment savePayment(Payment payment){
        return paymentService.savePayment(payment);
    }
}
