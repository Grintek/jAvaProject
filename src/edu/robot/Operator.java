package edu.robot;

public class Operator {
    private String firstName;
    private String lastName;

    private RobotManager robotManager;

    public Operator(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public RobotManager getRobotManager() {
        return robotManager;
    }

    public void setRobotManager(RobotManager robotManager){
        this.robotManager = robotManager;
    }
}
