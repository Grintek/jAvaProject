package test;

public class RobotManager {


    public static void main(String[] args) {

        RobotManager rm = new RobotManager();

        Robot robot = new Robot();

        System.out.println(robot.getCourse());

        robot.setCourse(45);

        System.out.println(robot.getCourse());

        robot.global(50);

        System.out.println(robot.getCourse());

        rm.changeCourse(robot);

        System.out.println(robot.getCourse());

    }

    private void changeCourse(Robot robot){

        robot.setCourse(189);


    }
}
