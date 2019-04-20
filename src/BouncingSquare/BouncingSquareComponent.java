package BouncingSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;


public class BouncingSquareComponent extends JComponent {
    private AtomicInteger y = new AtomicInteger(320);
    private AtomicInteger x =  new AtomicInteger(30);
    private int SZE = 30;
    //oval
    private AtomicInteger xOval = new AtomicInteger(65);
    private AtomicInteger yOval = new AtomicInteger(370);
    private int score = 0;
    private boolean ovalTrFol = false;
    private int widthOval = 30;
    private int heightOval = 30;
    private Random random = new Random();
    public void yPlus(){
        if(y.get() < 320) {
            int a = y.get();
            a += 1;
            y.set(a);
        }
    }
    public void yMinus(){
        if(y.get() > 50) {
            int a = y.get();
            a -= 1;
            y.set(a);
        }
    }
    public void xPlus(){
        if(x.get() < 370 ){
            int a = x.get();
            a += 1;
            x.set(a);
        }
    }
    public void xMinus(){
        if(x.get() > 0){
            int a = x.get();
            a -= 1;
            x.set(a);
        }
    }

    public void setYXOval(){
        if(!ovalTrFol) {
            int a = xOval.get();
            a--;
            xOval.set(a);
            if (xOval.get() < 0) {
                ovalTrFol = true;
            }
        }if(ovalTrFol){
            xOval.set(400);
            int a = random.nextInt(275) + 50;
            yOval.set(a);
            ovalTrFol = false;
        }
        if(xOval.get() < x.get() + 30 && xOval.get() + 30 > x.get() && yOval.get() < y.get() + 30 && yOval.get() + 30 > y.get()){
            ovalTrFol = true;
            score++;
        }

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x.get(), y.get(), SZE, SZE);

        g.drawOval(xOval.get(), yOval.get(), widthOval, heightOval);
        g.drawString("Щет: " + score, 50, 375);
        g.drawLine(0, 350, 400, 350  );
        g.drawLine(0, 50, 400, 50  );
    }


}
