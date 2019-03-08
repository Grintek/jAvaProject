package newRobot;

import newRobot.rb.RobotLine;

import java.util.ArrayList;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    // Список для хранения линий, по которым перемещался робот
    // Пока будем использовать его без подробностей
    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void forward(int distance) {
        // Запоминаем координаты робота перед перемещением
        final double xOld = this.x;
        final double yOld = this.y;
        // Меняем координаты
        this.x += distance * Math.cos(course / 180 * Math.PI);
        this.y += distance * Math.sin(course / 180 * Math.PI);
        // Запоминаем координаты пройденного пути в списке
        // Класс List позволяет добавить объект и хранить его
        lines.add(new RobotLine(xOld, yOld, this.x, this.y));
    }

    public void printCordinate(){

       System.out.println(getX()+ " " + getY());
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }
}
