package abstractClas;

import java.awt.*;

public class RectangleComponent extends TestAbstract {

    @Override
    protected void paintShape(Graphics g) {
        g.drawRect(5, 5,  getWidth() - 10, getHeight() - 10  );
    }
}
