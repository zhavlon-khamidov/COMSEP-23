package kg.alatoo.demosecurity.services;

import org.springframework.mail.MailAuthenticationException;
import org.springframework.mail.MailException;
import org.springframework.mail.MailParseException;
import org.springframework.mail.MailSendException;

public interface EmailService {

    void sendSimpleMessage(String to, String subject, String text)
            throws MailException;
}
