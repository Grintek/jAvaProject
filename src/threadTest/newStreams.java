package threadTest;

class TestThread extends Thread{

    @Override
    public void run() {
        System.out.println("Новый поток");
    }
}
public class newStreams {
    static TestThread ttd;

    public static void main(String[] args){

        ttd = new TestThread();

        ttd.start();

        System.out.println("закрытие главного потока");
    }
}



