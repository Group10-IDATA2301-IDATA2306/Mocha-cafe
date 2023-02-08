package no.ntnu.mocha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.services.email.EmailDetails;
import no.ntnu.mocha.services.email.EmailService;
 
@RestController
public class EmailController {
    
    @Autowired private EmailService emailService;
 
    /* Sending a simple Email. */
    @PostMapping("/sendMail")
    public boolean sendMail(@RequestBody EmailDetails details) {
        return emailService.sendSimpleMessage(details);
    }
 
    /* Sending email with attachment. */
    @PostMapping("/sendMailWithAttachment")
    public boolean sendMailWithAttachment(@RequestBody EmailDetails details, @RequestBody String pathToAttachment) {
        return emailService.sendMessageWithAttachment(details, pathToAttachment);
    }
}
