package no.ntnu.mocha.services.email;

/**
 * Represents an interface containing the basic functionality
 * which a email-service should contain.
 */
public interface EmailService {
    
    /**
     * Send a plain email without any attachements.
     *
     * @param details the details of the email including recipient, subject and body.
     * @return string confirming that the email was sent successfully.
     */
    public boolean sendSimpleMessage(EmailDetails details);


    /**
     * Send an email containing attached files.
     *
     * @param details the details of the email including recipient, subject and body.
     * @param pathToAttachment a string representing the file-path to the attachment.
     * @return string confirming that the email was sent successfully.
     */
    public boolean sendMessageWithAttachment(EmailDetails details, String pathToAttachment);
}
