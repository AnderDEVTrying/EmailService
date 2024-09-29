package com.example.EmailService.Core;

public record EmailRequest(String to, String subject, String body) {
}
