package mail;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {

    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        final String      target = "Austin Powers";
        final String      from;
        final String      to;
        final MailMessage mailMessage;

        if (mail.getClass() != MailMessage.class)
            return mail;
        mailMessage = (MailMessage) mail;
        from = mailMessage.getFrom();
        to   = mailMessage.getTo();

        if (from.equals(target) || to.equals(target)) {
            logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                    new Object[] { from, to, mailMessage.getMessage() });
        }
        else {
            logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                    new Object[] { from, to });
        }
//        RealMailService realMailService = new RealMailService();
//        realMailService.processMail(mail);
        return mail;
    }
}
