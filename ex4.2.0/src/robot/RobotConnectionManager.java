package robot;

/**
 * Interface for establishing a connection with the robot.
 */
public interface RobotConnectionManager {
    /**
     * Makes an attempt to connect with the robot.
     * @return An established connection through which you can give commands to the robot.
     */
    RobotConnection getConnection();
}
