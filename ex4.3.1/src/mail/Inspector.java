package mail;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {

        MailPackage mailPackage;
        String      content;


        if (mail.getClass() != MailPackage.class)
            return mail;
        mailPackage = (MailPackage) mail;
        content = mailPackage.getContent().getContent();
        if (content.contains("weapons"))
            throw new IllegalPackageException("The mail package contains weapons");
        if (content.contains("banned substance"))
            throw new IllegalPackageException("The mail package contains banned substance");
        if (content.contains("stones"))
            throw new StolenPackageException("Еhe contents of the package were stolen");
        return mail;
    }
}
