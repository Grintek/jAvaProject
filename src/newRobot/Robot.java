package newRobot;

import newRobot.interfacesRobot.RobotListener;
import newRobot.rb.RobotLine;

import java.util.ArrayList;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    // Список для хранения линий, по которым перемещался робот
    // Пока будем использовать его без подробностей
    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();

    private RobotListener listener;

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //метод для установки слушетеля
    public void setListener(RobotListener listener){
        this.listener = listener;
    }

    public void forward(int distance) {
        //вызываем слушетеля (если он установлен) в начале
        if(listener != null){
            listener.startMove(x, y);
        }
        // Запоминаем координаты робота перед перемещением
        final double xOld = this.x;
        final double yOld = this.y;
        // Меняем координаты
        this.x += distance * Math.cos(course / 180 * Math.PI);
        this.y += distance * Math.sin(course / 180 * Math.PI);
        //вызов слушателя после установки остановился
        if (listener != null){
            listener.endMove(x, y);
        }

        // Запоминаем координаты пройденного пути в списке
        // Класс List позволяет добавить объект и хранить его
        lines.add(new RobotLine(xOld, yOld, this.x, this.y));
    }

    public void printCoordinated(){

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
