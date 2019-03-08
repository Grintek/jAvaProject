package newRobot;

import newRobot.rb.RobotFrame;

import javax.swing.*;

public class RobotManager {

    public static void main(String[] args) {
        // Обьявляем масив
        Robot[] rdts = new Robot[10];
        // Количество сторон многоугольника
        for(int i = 0; i < rdts.length; i++){
            rdts[i] = new Robot(i * 10, i * 10);
        }
        for (int i =0; i< rdts.length; i++){
            rdts[i].printCordinate();
        }
//        final int COUNT = 12;
//        // Длина стороны
//        final int SIDE = 100;
//
//        Robot robot = new Robot(200, 50);
//        // Создаем замкнутую фигуру с количеством углов COUNT
//        for (int i = 0; i < COUNT; i++) {
//            robot.forward(SIDE);
//            robot.setCourse(robot.getCourse() + 360 / COUNT);
//        }
//
//        // Создаем форму для отрисовки пути нашего робота
//        RobotFrame rf = new RobotFrame(robot);
//        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        rf.setVisible(true);
    }
}
