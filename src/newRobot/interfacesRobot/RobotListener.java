package newRobot.interfacesRobot;

public interface RobotListener {

    //метод вызывается во время начала движения
    public void startMove(double x, double y);
    //метов вызывается во время остановки
    public void endMove(double x, double y);

}
