package moveSquare;

import sun.applet.AppletEvent;
import sun.applet.AppletListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareComponent extends JComponent implements ActionListener {

    //размер квадрата
    private static final int SQUARE_SIZE = 30;
    //размер шага
    private static final int STEP = 10;
    private int y = 0;
    private int x = 50;

    @Override
    public void actionPerformed(ActionEvent e) {
        // Входной параметр содержит ссылку на того, кто послал сообщение.
        // Получает объект с помощью вызова getSource()
        // С помощью слова instanceof мы можем проверить, что объект принадлежит
        // классу JButton (или его потомку)
        if(e.getSource() instanceof JButton){
            //приводи объект к типу JButton
            JButton btn = (JButton) e.getSource();
            //сравниваем команду со строкой UP
            if (MoveSquareFrame.UP.equals(btn.getActionCommand())){
                //двигаемся в верх уменьшая координаты у
                y -= STEP;
            }
            //сраниваем команду со строкой DOWN
            if (MoveSquareFrame.DOWN.equals(btn.getActionCommand())){
                //двигаемся в низ увеличивая координаты y
                y += STEP;
            }
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
    }
}
