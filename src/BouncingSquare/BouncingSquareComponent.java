package BouncingSquare;

import javax.swing.*;
import java.awt.*;


public class BouncingSquareComponent extends JComponent {
    private int y = 320;
    private int x = 30;
    private int SZE = 30;

    public void yPlus(){
        if(y < 320) {
            y += 10;
            repaint();
            System.out.println("идем в низ");
        }
    }
    public void yMinus(){
        if(y > 0) {
            y -= 10;
            repaint();
            System.out.println("идем в верх");
        }
    }

    public void xPlus(){
        if(x < 370 ){
            x += 10;
            repaint();
        }
    }
    public void xMinus(){
        if(x > 0){
            x -= 10;
            repaint();
        }
    }
    public void diagonal(){
        x += 10;
        y -= 10;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, SZE, SZE);

        g.drawLine(0, 350, 400, 350  );
    }


}
