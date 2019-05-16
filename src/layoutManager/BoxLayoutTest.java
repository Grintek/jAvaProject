package layoutManager;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest extends JFrame {

    public BoxLayoutTest(){
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for(int i = 0; i<20; i++){
            getContentPane().add(new JButton("" + i));
        }
        setBounds(100, 100, 50, 600);
    }
    public static void main(String[] args) {
        BoxLayoutTest box = new BoxLayoutTest();
        box.setDefaultCloseOperation(EXIT_ON_CLOSE);
        box.setVisible(true);

    }
}
