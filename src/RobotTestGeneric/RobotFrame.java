package RobotTestGeneric;

import javax.swing.*;

public class RobotFrame extends JFrame {

    public RobotFrame(Robot robot){
        setTitle("Robot Frame");

        //добавляем компонент
        add(new RobotPathComponent(robot));
        // установим размер окна
        setBounds(100, 100, 500, 500);

    }
}
