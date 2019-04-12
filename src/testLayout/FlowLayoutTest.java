package testLayout;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest()
    {
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        for(int k=0; k<40; k++) {
            getContentPane().add(new JButton(""+k));
        }
        setBounds(100,100,400,300);
    }

    public static void main(String[] args)
    {
        FlowLayoutTest flt = new FlowLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}
