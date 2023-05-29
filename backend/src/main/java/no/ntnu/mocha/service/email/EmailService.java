package no.ntnu.mocha.service.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

/**
 * Represents an email-handler which is responsible for 
 * sending emails to a user upon signing up with a given
 * email address.
 */
@Service public class EmailService {
    
    /** Senders email-address. */
    @Value("${spring.mail.username}") private String sender;
    @Autowired private JavaMailSender emailClient;


    /**
     * Sends an email welcoming a new user to the Mocha customer
     * zone.
     * 
     * @param receiver The email-address of the person to send the mail to.
     */
    public void sendAccountConfirmation(String receiver) {
        try {
            MimeMessage message = emailClient.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("Account confirmation");
            helper.setText("Thank you for creating your account at Mocha!");

            emailClient.send(message);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
