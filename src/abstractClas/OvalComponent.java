package abstractClas;

import java.awt.*;

public class OvalComponent extends TestAbstract {
    @Override
    protected void paintShape(Graphics g) {
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
