package layoutManager;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest extends JFrame {
    public GridBagLayoutTest(){
        GridBagLayout gridBL = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        getContentPane().setLayout(gridBL);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        makebutton("Button1", gridBL, c);
        makebutton("Button2", gridBL, c);
        makebutton("Button3", gridBL, c);

        c.gridwidth = GridBagConstraints.REMAINDER; // конец строки
        makebutton("Button4", gridBL, c);

        c.weightx = 0.0; // вернуть к значению по умолчанию
        makebutton("Button5", gridBL, c); //другая строка

        //попробуйте закрыть эту строку и открыть следующую за ней
        c.gridwidth = GridBagConstraints.RELATIVE; // предпоследний элемент
        //c.gridwidth = 1;
        makebutton("Button6", gridBL, c);

        c.gridwidth = GridBagConstraints.REMAINDER; //конец строки
        makebutton("Button7", gridBL, c);

        c.gridwidth = 1; // устанавливаем значения по умолчанию
        c.gridheight = 2;
        //попробуйте убрать эту строку
        c.weighty = 1.0;
        makebutton("Button8", gridBL, c);

        //попробуйте убрать эту строку
        c.weighty = 0.0;     //установить значение по умолчанию
        c.gridwidth = GridBagConstraints.REMAINDER; //конец строки
        c.gridheight = 1;     //установить значение по умолчанию
        makebutton("Button9", gridBL, c);
        makebutton("Button10", gridBL, c);

        setBounds(100, 200, 600, 400);


    }

    protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints c){

        Button button = new Button(name);
        gridbag.setConstraints(button, c);
        getContentPane().add(button);
    }

    public static void main(String[] args) {
        GridBagLayoutTest flt = new GridBagLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}
