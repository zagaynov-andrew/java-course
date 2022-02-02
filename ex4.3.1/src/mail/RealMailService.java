package mail;

/**
 * A class in which the logic of real mail is hidden.
 */
public class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // The code of the real mail sending system is described here..
        return mail;
    }
}
