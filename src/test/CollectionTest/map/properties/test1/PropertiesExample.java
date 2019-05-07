package test.CollectionTest.map.properties.test1;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.PropertyResourceBundle;

public class PropertiesExample extends JFrame {
    public PropertiesExample() {


        //создаем объект Properties
        PropertyResourceBundle pro = (PropertyResourceBundle) PropertyResourceBundle.getBundle("test.CollectionTest.map.properties.test2.simple", new Locale("ru"));
        //загружаем данные из файла


        //помещаем свойства по именам
        String upProp = pro.getString("up.button.title");
        String downProp = pro.getString("dn.button.title");

        JButton btu = new JButton(upProp);
        JButton btd = new JButton(downProp);

        add(btu, BorderLayout.NORTH);
        add(btd, BorderLayout.SOUTH);

        setBounds(200, 200, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PropertiesExample pe = new PropertiesExample();
    }
}
