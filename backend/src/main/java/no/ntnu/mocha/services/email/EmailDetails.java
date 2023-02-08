package no.ntnu.mocha.services.email;

/**
 * Represents the content of an email.
 *
 * The class acts as a wrapper around the three main components
 * of every valid email.
 *
 * @since 08.02.2023
 */
public class EmailDetails {
    
    /** Email address of the recipient. */
    private String receiver;
    /** Title of the email. */
    private String subject;
    /** Content of the message body. */
    private String message;


    /**
     * Create new instance of the EmailDetails-class.
     *
     * @param receiver the email address of the recipient.
     * @param subject  the subject/title of the email.
     * @param message  the message itself.
     */
    public EmailDetails(String receiver, String subject, String message) {
        this.receiver = receiver;
        this.subject = subject;
        this.message = message;
    }

    /**
     * Get the email address of the receiver.
     *
     * @return recipient address.
     */
    public String getReceiver() { return receiver; }

    /**
     * Get the email subject.
     *
     * @return title of the email.
     */
    public String getSubject() { return subject; }

    /**
     * Get the content of the email's body.
     *
     * @return message of the email.
     */
    public String getMessage() { return message; }


    private void setReceiver(String receiver) { this.receiver = receiver; }
    private void setSubject(String subject) { this.subject = subject; }
    private void setMessage(String message) { this.message = message; }
}
