package threadTest.test2;

public class SimpleThreadManager {
    public static void main(String[] args) {
        for ( int i = 0; i<10; i++){
            Thread tr = new SimpleThread();
            tr.start();
        }
    }
}

class SimpleThread extends Thread{
    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random() * 2000);
            Thread.sleep(pause);
            System.out.println("Simple Thread - pause = " + pause);
        } catch (InterruptedException e) {

        }
    }
}