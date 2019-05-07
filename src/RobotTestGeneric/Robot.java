package RobotTestGeneric;

import java.util.ArrayList;

public class Robot{

    private double x = 0;
    private double y = 0;
    protected double course = 0;
    // Список для хранения линий, по которым перемещался робот
    // Пока будем использовать его без подробностей
    private ArrayList<RobotLine<Double>> lines = new ArrayList<>();

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public void forward(double distance) {
        // Запоминаем координаты робота перед перемещением
        final double xOld = x;
        final double yOld = y;
        // Меняем координаты
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
        // Запоминаем координаты пройденного пути в списке
        // Класс List позволяет добавить объект и хранить его
        lines.add(new RobotLine<>(xOld, yOld, x, y));
    }


    public double getCourse() {
        return course;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine<Double>> getLines() {
        return lines;
    }
}
