package no.ntnu.mocha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
    
    @Autowired
    private JavaMailSender emailClient;

    @Value("${spring.mail.username}") 
    private String sender;


    public void sendAccountConfirmation(String receiver) {
        try {
            MimeMessage message = emailClient.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("Account confirmation");
            helper.setText("Thank you for creating your account at Mocha!");

            emailClient.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
