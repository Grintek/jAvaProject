package test2.list;

import test2.Robot;

import javax.swing.*;

public class RobotFrame extends JFrame {

    public RobotFrame(Robot robot){

        setTitle("Robot Frame");

        add(new RobotPathComponent(robot));

        setBounds(100, 100, 500, 500);
    }
}
