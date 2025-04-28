package com.payment.reminder.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ResponseDto<T> {
    private String message;
    private T data;
}
