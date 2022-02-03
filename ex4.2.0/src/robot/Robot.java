package robot;

public class Robot {
    public void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        RobotConnection robotConnection = null;
//        int i = 0;
//
//        while (robotConnection == null && i < 3) {
//            try {
//                robotConnection = robotConnectionManager.getConnection();
//            }
//            catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//            i++;
//        }
//        if (robotConnection == null)
//            throw new RobotConnectionException("Failed to establish a connection with the robot.");
//
//        try {
//            robotConnection.moveRobotTo(toX, toY);
//        }
//        finally {
//            try {
//                robotConnection.close();
//            }
//            catch () {
//
//            }
//        }
        int nbAttempts = 3;

        for (int i = 0; i < nbAttempts; ++i) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = nbAttempts;
            }
            catch (RobotConnectionException ex) {
                if (i == nbAttempts - 1)
                    throw new RobotConnectionException("Failed to establish a connection with the robot.");
            }
        }


    }

}
