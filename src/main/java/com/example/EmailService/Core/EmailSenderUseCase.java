package com.example.EmailService.Core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
