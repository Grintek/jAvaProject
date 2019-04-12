package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAnonymous extends JFrame {
    public TestAnonymous(){
        JButton btn = new JButton("Say Hello");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World");
            }
        });

        add(btn, BorderLayout.NORTH);

        setBounds(100, 100, 200, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args){
        TestAnonymous ta = new TestAnonymous();
        Asd asd = new Asd() {
            @Override
            public void sayHello() {
                super.sayHello();
            }
        };
        asd.sayHello();
    }
}

abstract class Asd{
    public void sayHello(){
        System.out.println("Hello");

    }
}


