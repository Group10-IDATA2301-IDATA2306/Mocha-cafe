package no.ntnu.mocha.services.email;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailServiceImplementation implements EmailService {
    
    @Value("${spring.mail.username}") private String sender;

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public boolean sendSimpleMessage(EmailDetails details) { 
        try {
            /* Creates new SimpleMailMessage instance. */
            SimpleMailMessage mailMessage = new SimpleMailMessage();
 
            /* Congifures email from EmailDetails. */
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getReceiver());
            mailMessage.setText(details.getMessage());
            mailMessage.setSubject(details.getSubject());
 
            /* Sends the email. */
            emailSender.send(mailMessage);
            return true;
        }
 
        /* Returns false if there is an exception. */
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean sendMessageWithAttachment(EmailDetails details, String pathToAttachment) {

        /* Creates new MimeMessage-instance. */
        MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
 
        try {
            /* Enables attachment support by setting multipart to true. */
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(details.getReceiver());
            mimeMessageHelper.setText(details.getMessage());
            mimeMessageHelper.setSubject(details.getSubject());
 
            /* Adding the attachment. */
            FileSystemResource file = new FileSystemResource(new File(pathToAttachment));
 
            if (!file.exists()) {
                 return false; 
            } else {
                mimeMessageHelper.addAttachment(file.getFilename(), file);
 
                /* Sends the email. */
                emailSender.send(mimeMessage);
                return true;
            }
        }

        /* Returns false if there is an exception. */
        catch (Exception e) {
            return false;
        }
    }
}
