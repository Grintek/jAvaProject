package robot;

import edu.robot.Operator;
import edu.robot.RobotManager;

public class Robot {

     public static void main(String[] args){
            Operator operator = new Operator("johan", "Luiz");
            RobotManager robots = new RobotTotal(0, 0);

            //robot.RobotExt robot = new robot.RobotExt(20, 40, 20);
            robots.forward(20);
            
            robots.printCoordinates();
            
            robots.setCourse(90);

            robots.forward(20);

            robots.printCoordinates();

            robots.setCourse(45);

            robots.forward(20);

            robots.printCoordinates();

            System.out.println("Course = " + robots.getCourse());

            //robots.back(80);

            robots.printCoordinates();

            System.out.println(robots.getClass().getName());



            System.out.println("First name: " + operator.getFirstName()+ "\n" + "Last name: " + operator.getLastName());

            robots.setOperator(operator);

            System.out.println(robots.getOperator().getLastName());
            System.out.println(robots.getOperator().getFirstName());

            System.out.println(operator.getRobotManager());
     }
}

