package moveSquare;

import javax.swing.*;

public class MoveSquare {
    public static void main(String[] args){
        //зоздаем обьект графического окна
        MoveSquareFrame msf = new MoveSquareFrame();
        //задаем правило по которому приложение завершается при закрытии
        msf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //указываем что окно было видемым
        msf.setVisible(true);


    }
}
