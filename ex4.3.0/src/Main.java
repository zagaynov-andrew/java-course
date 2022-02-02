import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        configureLogging();
        final Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
        final Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
        final Logger LOGGER = Logger.getLogger("org.stepic.java");

        // Some tests.
        LOGGER_A.info("Some info from A");
        LOGGER_B.info("Some info from B");
        LOGGER_B.warning("Some info from B");
        LOGGER.info("Some info");
    }

    /**
     * Configures logging parameters.
     */
    private static void configureLogging() {
        final Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
        final Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
        final Logger LOGGER   = Logger.getLogger("org.stepic.java");

        LOGGER.setUseParentHandlers(false);
        LOGGER_A.setLevel(Level.ALL);
        LOGGER_B.setLevel(Level.WARNING);
        ConsoleHandler handler = new ConsoleHandler();
        XMLFormatter formatter = new XMLFormatter();
        handler.setLevel(Level.ALL);
        LOGGER.addHandler(handler);
        handler.setFormatter(formatter);
    }
}
