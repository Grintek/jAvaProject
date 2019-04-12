package newRobot;

import newRobot.interfacesRobot.RobotListener;

public class SimpleRobotListener implements RobotListener {
    @Override
    public void startMove(double x, double y) {
        System.out.println("Робот начал движене " + "x: "+ x + " y: " + y );
    }

    @Override
    public void endMove(double x, double y) {
        System.out.println("Робот закончил движене " + "x: "+ x + " y: " + y );
    }
}
