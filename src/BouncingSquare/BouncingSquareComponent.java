package BouncingSquare;

import javax.swing.*;
import java.awt.*;


public class BouncingSquareComponent extends JComponent {
    private int y = 320;
    private int x = 30;
    private int SZE = 30;
    //oval
    private int xOval = 40;
    private int yOval = 200;
    private int widthOval = 60;
    private int heightOval = 60;

    public void yPlus(){
        if(y < 320) {
            y += 3;
            System.out.println("идем в низ");
        }
    }
    public void yMinus(){
        if(y > 0) {
            y -= 3;
            System.out.println("идем в верх");
        }
    }
    public void xPlus(){
        if(x < 370 ){
            x += 3;
        }
    }
    public void xMinus(){
        if(x > 0){
            x -= 3;
        }
    }

    public void setYXOval(){
        if(x < 370 && y > 0){
            yOval--;
            xOval++;
        }else{
            yOval++;
            xOval--;
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, SZE, SZE);

        g.drawOval(xOval, yOval, widthOval, heightOval);

        g.drawLine(0, 350, 400, 350  );
    }


}
