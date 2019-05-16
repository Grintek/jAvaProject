package layoutManager.myLayout;

import javax.swing.*;

public class DiagLayoutTest extends JFrame {

    public DiagLayoutTest(){
        getContentPane().setLayout(new DiagLayout());
        for (int i = 0; i<5; i++){
            getContentPane().add(new JButton(""+i));
        }
        for (int i = 0; i<5; i++){
            getContentPane().add(new JLabel(""+i, JLabel.CENTER));
        }
        setBounds(100,200, 600 ,400);

    }

    public static void main(String[] args) {
        DiagLayoutTest dt = new DiagLayoutTest();
        dt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dt.setVisible(true);
    }
}
