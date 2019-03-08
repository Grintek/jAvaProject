package robot;

import edu.robot.RobotManager;

public class RobotExt extends RobotManager {

    public RobotExt(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void back(int distance){
        forward(-distance);
    }
}
