package com.edumarketplace.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String transactionId;
        private Double amount;

        @Enumerated(EnumType.STRING)
        private PaymentStatus status;

        private LocalDateTime paidAt;

        @OneToOne(mappedBy = "payment")
        private Session session;

}
