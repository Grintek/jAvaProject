package test;

public class Robot {
   private double course = 0;

   public double getCourse(){
       return course;
   }

    public void setCourse(double course) {
        this.course = course;
    }

    public void global(double course){
       this.course = this.course * course;
    }
}
