package com.example.EmailService.Infra.Ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.example.EmailService.Adapters.EmailSenderGateway;
import com.example.EmailService.Core.Exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SesEmailSender implements EmailSenderGateway {
    private final AmazonSimpleEmailService sesClient;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService sesClient){
        this.sesClient=sesClient;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("azango94@gmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );

        try {
            sesClient.sendEmail(request);
        } catch (AmazonServiceException ex) {
            throw new EmailServiceException("Email sending failed", ex);
        }
    }
}
