package test2.list;

import test2.Robot;
import test2.RobotManager;

import javax.swing.*;
import java.awt.*;

public class RobotPathComponent extends JComponent {

    private Robot robot;

    public RobotPathComponent(Robot robot){
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        RobotLine line;

        for(int i = 0; i < robot.getSizeList(); i++);{
            line = (RobotLine)robot.pull();
            int x1 = (int) Math.round(line.getX1());
            int y1 = (int) Math.round(line.getY1());
            int x2 = (int) Math.round(line.getX2());
            int y2 = (int) Math.round(line.getY2());
            g.drawLine(x1, y1, x2, y2);
        }

    }
}
