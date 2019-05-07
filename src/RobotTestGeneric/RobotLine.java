package RobotTestGeneric;

public class RobotLine<T> {
    private T x1;
    private T y1;
    private T x2;
    private T y2;

    public RobotLine(T x1, T y1, T x2, T y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public T getX1() {
        return x1;
    }

    public T getX2() {
        return x2;
    }

    public T getY1() {
        return y1;
    }

    public T getY2() {
        return y2;
    }
}
