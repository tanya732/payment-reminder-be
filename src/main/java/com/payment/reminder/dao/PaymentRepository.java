package com.payment.reminder.dao;

import com.payment.reminder.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByCustomerIdAndPaymentTypeAndPaymentStatusAndInternalUserId(
            Long customerId, String paymentType, String paymentStatus, Long internalUserId);

    Payment findByCustomerIdAndPaymentTypeAndPaymentStatus(
            Long customerId, String paymentType, String paymentStatus);

    List<Payment> findByStatusAndDueDateBefore(String pending, Date yesterdayDate);
}