package BouncingSquare;

import test.TestAnonymous;

public class ThreadComponent extends Thread{
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;
    public BouncingSquareComponent bsc;
    public static int i = 0;
    ThreadComponent(BouncingSquareComponent bsc){
        this.bsc = bsc;
    }
    @Override
    public void run() {
        for(i = 0; i < 1;){
            try {
                sleep(30);
            } catch (InterruptedException e) {}
            bsc.repaint();
            BouncingSquareFrame.press();
        }
    }
}

class ThreadAnim extends Thread{
    public BouncingSquareComponent bsc;
    ThreadAnim(BouncingSquareComponent bsc){
        this.bsc = bsc;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            try {
                sleep(30);
            } catch (InterruptedException e) {}
            bsc.setYXOval();
        }
    }
}