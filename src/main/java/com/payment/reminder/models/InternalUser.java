package com.payment.reminder.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "internal_users")
@AllArgsConstructor
@NoArgsConstructor
public class InternalUser extends BaseModel {
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
}
