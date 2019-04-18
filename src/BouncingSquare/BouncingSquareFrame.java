package BouncingSquare;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BouncingSquareFrame extends JFrame {
    private static BouncingSquareComponent bc;
    private ThreadComponent tc;
    private ThreadAnim ta;
    private static boolean up = false;
    private static boolean down = false;
    private static boolean left = false;
    private static boolean right = false;

//передаем в другой поток для плавного передвижения квадрата без задержки при зажатия клавиши
    public static void press(){
        if(up){
            bc.yMinus();
        }
        if(down){
            bc.yPlus();
        }
        if(right){
            bc.xPlus();
        }
        if(left){
            bc.xMinus();
        }
    }
    public BouncingSquareFrame(){


        bc = new BouncingSquareComponent();
        tc = new ThreadComponent(bc);
        ta = new ThreadAnim(bc);
        tc.start();
        ta.start();
        bc.addKeyListener(new KeyListener() {


            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    up = true;
                }if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    down = true;
                }if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    left = true;
                }if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    right = true;
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    up = false;
                }if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    down = false;
                }if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    left = false;
                }if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    right = false;
                }
            }
        });
        bc.setFocusable(true);
        add(bc);
        setBounds(400, 100 , 400 , 400);
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {}
            bc.setYXOval();
        }
    }
}
