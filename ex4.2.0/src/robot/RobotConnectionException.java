package robot;

/**
 * Exception class for the robot.
 */
public class RobotConnectionException extends RuntimeException {
    /**
     * Constructor.
     * @param message Description of this throwable.
     */
    public RobotConnectionException(String message) {
        super(message);
    }

    /**
     * Constructor.
     * @param message Description of this throwable.
     * @param cause The cause of this throwable or null if the cause is nonexistent or unknown.
     */
    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
