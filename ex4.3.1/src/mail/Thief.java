package mail;

public class Thief implements MailService{

    int stolenValue;
    int minPrice;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        final MailPackage mailPackage;

        if (mail.getClass() != MailPackage.class)
            return mail;
        mailPackage = (MailPackage) mail;
        int packagePrice = mailPackage.getContent().getPrice();
        if (packagePrice >= minPrice) {
            stolenValue += packagePrice;
            Package newPackage =
                    new Package("stones instead of " + mailPackage.getContent().getContent(), 0);
            return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), newPackage);
        }
        return mail;
    }
}
