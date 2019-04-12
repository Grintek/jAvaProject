package abstractClas;

import javax.swing.*;
import java.awt.*;

public abstract class  TestAbstract extends JComponent {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        paintShape(g);
    }

    protected abstract void paintShape(Graphics g);



}
