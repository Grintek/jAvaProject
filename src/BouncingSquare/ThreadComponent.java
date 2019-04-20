package BouncingSquare;

import test.TestAnonymous;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadComponent {
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;
    public BouncingSquareComponent bsc;
    public static int i = 0;

    ThreadComponent(BouncingSquareComponent bsc) {
        this.bsc = bsc;
    }

    public ExecutorService cycleFlow() {
        ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
        threadExecutor.submit(() -> {
            for (i = 0; i < 1; ) {
                try {
                    Thread.sleep(5);

                } catch (InterruptedException e) {}
                threadExecutor.shutdown();
                BouncingSquareFrame.press();
            }
        });
        return threadExecutor;
    }
    public ExecutorService animFlow(){
        ExecutorService animExecutor = Executors.newSingleThreadExecutor();
        animExecutor.submit(() -> {
            for (int i = 0; i < 1;) {
                try {
                    Thread.sleep(6);
                } catch (InterruptedException e) {}
                bsc.setYXOval();
            }
        });

        return animExecutor;
    }
}





