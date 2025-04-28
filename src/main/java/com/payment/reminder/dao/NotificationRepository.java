package com.payment.reminder.dao;

import com.payment.reminder.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Notification findByCustomerIdAndPaymentTypeAndPaymentStatusAndInternalUserId(
            Long customerId, String paymentType, String paymentStatus, Long internalUserId);

    Notification findByCustomerIdAndPaymentTypeAndPaymentStatus(
            Long customerId, String paymentType, String paymentStatus);

    Notification findTopByPaymentIdOrderBySentDateDesc(long paymentId);
}