package com.payment.reminder.controller;

import com.payment.reminder.dto.ResponseDto;
import com.payment.reminder.service.InternalUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/internal")
public class InternalUserController {

    private final InternalUserService internalUserService;

    public InternalUserController(InternalUserService internalUserService) {
        this.internalUserService = internalUserService;
    }

    @GetMapping("/login")
    public ResponseDto<?> login(@RequestAttribute("userName") String userName, @RequestAttribute("password") String password) {
        return internalUserService.login(userName, password);
    }

    @GetMapping("/logout")
    public ResponseDto<?> logout(@RequestAttribute("userName") String userName) {
        return internalUserService.logout(userName);
    }

    @PostMapping("/forget-password")
    public ResponseDto<?> forgetPassword(@RequestAttribute("userName") String userName,
                                         @RequestAttribute("newPassword") String newPassword) {
        return internalUserService.forgetPassword(userName, newPassword);
    }
}
