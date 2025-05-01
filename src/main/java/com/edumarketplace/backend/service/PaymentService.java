package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getPayments();
    Payment getPaymentById(Long id);
    Payment savePayment(Payment payment);
    Payment updatePayment (Long id, Payment payment);
    void removePaymentById(Long id);
}
