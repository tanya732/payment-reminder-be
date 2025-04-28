package com.payment.reminder.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = new Date();
    }

    @PrePersist
    public void preUpdate() {
        if(updatedAt == null) {
            this.updatedAt = new Date();
        }
    }
}
