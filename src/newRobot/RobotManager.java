package newRobot;

import newRobot.interfacesRobot.RobotListener;
import newRobot.rb.RobotFrame;

import javax.swing.*;

public class RobotManager {

    public static void main(String[] args) {
        // Обьявляем масив
        final int COUNT = 4;
        // Длина стороны
        final int SIDE = 100;

        Robot robot = new Robot(200, 50);
        //устанавливаем слушателя
        RobotListener srl = new SimpleRobotListener();

        robot.setListener(srl);
        // Создаем замкнутую фигуру с количеством углов COUNT
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }

        // Создаем форму для отрисовки пути нашего робота
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}
