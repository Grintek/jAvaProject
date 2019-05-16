package layoutManager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {

    public BorderLayoutTest(){
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JButton("Север"), BorderLayout.NORTH);
        getContentPane().add(new JButton("ЮГ"), BorderLayout.SOUTH);
        getContentPane().add(new JButton("Запад"), BorderLayout.WEST);
        getContentPane().add(new JButton("Восток"), BorderLayout.EAST);
        getContentPane().add(new JButton("Центер"), BorderLayout.CENTER);

        setBounds(100, 200, 300, 400);

    }
    public static void main(String[] args) {
        BorderLayoutTest blt = new BorderLayoutTest();
        blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        blt.setVisible(true);

    }
}
