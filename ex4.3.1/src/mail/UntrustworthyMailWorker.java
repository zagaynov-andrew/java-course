package mail;

public class UntrustworthyMailWorker implements MailService {

    private final MailService realMailService = new RealMailService();
    private final MailService[] services;

    public UntrustworthyMailWorker(MailService[] services) {
        this.services = services;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processedMail = mail;

        for (MailService service : services) {
            processedMail = service.processMail(processedMail);
        }
        return realMailService.processMail(processedMail);
    }
}
