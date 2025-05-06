package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Payment;
import com.edumarketplace.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("payment")
    public Payment savePayment(Payment payment){
        return paymentService.savePayment(payment);
    }

    @GetMapping("payments")
    public List<Payment> paymentList(){
        return paymentService.getAllPayments();
    }
}
