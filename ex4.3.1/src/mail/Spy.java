package mail;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {

    static final Logger LOGGER = Logger.getLogger(MailService.class.getName());

    @Override
    public Sendable processMail(Sendable mail) {
        final MailMessage mailMessage = (MailMessage) mail;
        final String TARGET = "Austin Powers";
        final String FROM   = mailMessage.getFrom();
        final String TO     = mailMessage.getTo();

        if (FROM.equals(TARGET)) {
            LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                    new Object[] { FROM, TO, mailMessage.getMessage() });
        }
        else {
            LOGGER.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                    new Object[] { FROM, TO });
        }
        RealMailService realMailService = new RealMailService();
//        realMailService.processMail(mail);
        return mail;
    }
}
