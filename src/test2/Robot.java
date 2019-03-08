package test2;

import test2.list.RobotLine;

public class Robot
{
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    private RobotObject head = null;
    private RobotObject tail = null;
    private Object listObj;
    private Robot list;
    private int size = 0;
    private int sizeList = 0;

    //private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();

    public Robot(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setListObj(Object listObj) {
        this.listObj = listObj;
    }


    public void forward(int distance){

        final double xOld = x;
        final double yOld = y;

        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);

        push(new RobotLine(xOld, yOld, x, y));
    }

    public void push(Object obj){
        //создаем новый обьект и добавляем в него прилетевший объект с данными
        RobotObject rObj = new RobotObject();
        rObj.setObject(obj);


        if(size == 0){
            head = rObj;
        }else {
            tail.setNext(rObj);
        }
        tail = rObj;

        size++;
        sizeList = size;
    }

    public Object pull(){

        if(size == 0){
            return null;
        }

        Object obj = head.getObject();

        head = head.getNext();

        if(head == null){
            tail = null;
        }

      size--;

        return obj;
    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getCourse(){
        return course;
    }

    public void setCourse(double course){
        this.course = course;
    }

  //  public ArrayList<RobotLine> getLines(){
    //    return lines;
    //}


    public int getSizeList() {
        return sizeList;
    }

    public int size(){
        return size;
    }
     public class RobotObject {
        // хранит объекты
        private Object object;
        private RobotObject next;

        public void setObject(Object object) {
            this.object = object;
        }

        public Object getObject() {
            return object;
        }

        public void setNext(RobotObject next){
            this.next = next;
        }

        public RobotObject getNext(){
            return next;
        }
    }
}
