package BouncingSquare;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BouncingSquareFrame extends JFrame {
    private BouncingSquareComponent bc;
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;

    public BouncingSquareFrame(){
        bc = new BouncingSquareComponent();
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

    }
}
