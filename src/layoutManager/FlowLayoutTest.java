package layoutManager;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame {

    public FlowLayoutTest(){
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        for(int i = 0; i<20; i++){
            getContentPane().add(new JButton("" + i));
        }
        setBounds(100, 100, 50, 600);
    }
    public static void main(String[] args) {
        FlowLayoutTest flowLayoutTest = new FlowLayoutTest();
        flowLayoutTest.setDefaultCloseOperation(EXIT_ON_CLOSE);
        flowLayoutTest.setVisible(true);

    }
}
