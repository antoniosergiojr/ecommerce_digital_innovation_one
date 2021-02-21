package com.antonio.ecommerce.payment.service;

import com.antonio.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.antonio.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
