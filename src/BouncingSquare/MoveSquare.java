package BouncingSquare;

import javax.swing.*;

public class MoveSquare {
    public static void main(String[] args){
        BouncingSquareFrame bsf = new BouncingSquareFrame();

        bsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bsf.setVisible(true);
        for(int i= 0; i<1; i--){
            for(i = 0; i < 100; i++) {
                bsf.repaint();
            }
        }

    }
}
