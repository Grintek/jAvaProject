package threadTest.test1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class testRunable {
    public static void main(String[] args){
        Runnable task = (new Runnable() {
            @Override
            public void run() {
                String string = Thread.currentThread().getName();
                System.out.println("Hello " + string);
            }
        });
        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("DONE!");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("попытка выключить исполнитель");
                    executorService.shutdown();
                    executorService.awaitTermination(5, TimeUnit.SECONDS);
                }catch (InterruptedException e){
                    System.err.println("прерваны задачи");
                }
                finally {
                    if(!executorService.isTerminated()){
                        System.err.println("Остановить не завершонные задачи");
                    }
                    executorService.shutdownNow();
                    System.out.println("завершение работы");
                }
            }
        });
    }
}
