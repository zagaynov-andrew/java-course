package robot;

/**
 * Robot connection interface.
 */
public interface RobotConnection extends AutoCloseable {
    /**
     * Moves the robot to the specified point.
     * @param x X coordinate of the point.
     * @param y Y coordinate of the point.
     */
    void moveRobotTo(int x, int y);

    /**
     * Closes the connection with the robot.
     */
    @Override
    void close();
}
