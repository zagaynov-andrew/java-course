package mail;

/**
 * An interface that specifies a class that can handle a mail object in some way.
 */
public interface MailService {
    Sendable processMail(Sendable mail);
}
