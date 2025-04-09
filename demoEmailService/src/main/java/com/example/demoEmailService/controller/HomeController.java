package com.example.demoEmailService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoEmailService.service.SendOtpMailService;

@RestController
public class HomeController {

    @Autowired
    private SendOtpMailService service;

    // Home endpoint
    @GetMapping("/")
    public String home() {
        return "Welcome to Spring";
    }

    // Send OTP to provided email
    @PostMapping("/sendOtp/{email}")
    public ResponseEntity<String> sendOtpToMail(@PathVariable("email") String email) {
        try {
            // Send OTP service method
            service.sendOtpService(email);
            // Return a success response with HTTP 200
            return new ResponseEntity<>("OTP sent successfully to " + email, HttpStatus.OK);
        } catch (Exception e) {
            // Return an error response with HTTP 400 or 500
            return new ResponseEntity<>("Failed to send OTP. Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
