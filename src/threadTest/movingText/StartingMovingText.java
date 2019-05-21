package threadTest.movingText;

import javax.swing.*;

public class StartingMovingText {
    public static void main(String[] args) {
        //просто запускаем наше окно и делаем его видимым
        MovingTextJFrame mj = new MovingTextJFrame();
        //а тут закрываемым в месте с процессом
        mj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mj.setVisible(true);
    }
}
