package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentService{
    @Override
    public List<Payment> getPayments() {
        return null;
    }

    @Override
    public Payment getPaymentById(Long id) {
        return null;
    }

    @Override
    public Payment savePayment(Payment payment) {
        return null;
    }

    @Override
    public Payment updatePayment(Long id, Payment payment) {
        return null;
    }

    @Override
    public void removePaymentById(Long id) {

    }
}
