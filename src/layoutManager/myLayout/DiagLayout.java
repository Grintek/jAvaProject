package layoutManager.myLayout;

import java.awt.*;

public class DiagLayout implements LayoutManager {
    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return computeLayoutSize(parent);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return computeLayoutSize(parent);
    }

    public Dimension computeLayoutSize(Container parent){
        int prefWidth = 0;
        int prefHeight = 0;
        Component[] components = parent.getComponents();
        for(int k = 0; k<components.length; k++){
            prefWidth += components[k].getWidth();
            prefHeight += components[k].getHeight();
        }
        return new Dimension(prefWidth, prefHeight);
    }

    @Override
    //здезь раставляем компоненты по диагонали
    public void layoutContainer(Container parent) {
        Component[] components = parent.getComponents();
        int row = 0;
        int col = 0;
        //эти две строки можно закрыть кометарием
        int width = parent.getWidth() / components.length;
        int height = parent.getHeight() / components.length;

        for(int i = 0; i < components.length; i++){
            Rectangle rectangle = new Rectangle(col, row, width, height);

            components[i].setBounds(rectangle);

            col += width;
            row += height;
        }
    }
}
