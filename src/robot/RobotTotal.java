package robot;

import edu.robot.*;

public class RobotTotal extends RobotManager{

    private double totalDistance = 0;

    public RobotTotal(double x, double y) {
        super(x, y);
    }

    @Override
    public void forward(int distance){
        totalDistance += distance;
        super.forward(distance);

        System.out.println("robot.RobotTotal");
    }

    public double getTotalDistance(){
        return totalDistance;
    }
}
