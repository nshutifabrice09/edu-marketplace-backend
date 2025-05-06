package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Payment;
import com.edumarketplace.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @GetMapping("payments")
    public List<Payment> paymentList(){
        return paymentService.getAllPayments();
    }

    @GetMapping("/payment/{id}")
    public Payment getPaymentById(@PathVariable ("id") Long id){
        return paymentService.getPaymentById(id);
    }

    @PostMapping("payment")
    public Payment savePayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }

    @PutMapping("/update/payment/{id}")
    public Payment updatePayment(@PathVariable ("id") Long id, @RequestBody Payment payment){
        return paymentService.updatePayment(id, payment);
    }



}
