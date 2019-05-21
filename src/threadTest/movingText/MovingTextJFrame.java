package threadTest.movingText;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MovingTextJFrame extends JFrame {
    private final JLabel textJLabel = new JLabel();
    private MoveTextThread mtj;
    private int X_text;
    private int Y_text;
    private boolean asx = true;
    private boolean asy = true;

    public MovingTextJFrame() {
        //заголовок
        setTitle("MovingText");
        //создаем панель
        JPanel jPanel = (JPanel) this.getContentPane();
        jPanel.setLayout(null);
        //размер шрифта
        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 24);
        textJLabel.setFont(f);

        // задаем размер и расположение
        textJLabel.setSize(290, 20);

        //добавляем label в panel
        jPanel.add(textJLabel);
        this.setContentPane(jPanel);

        setBounds(300, 300, 500, 500);
        mtj = new MoveTextThread(this);
        mtj.start();

    }

    public void setTime() {
        // более коректный вызов в другом потоке который отвечает за графику
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                textJLabel.setText(df.format(Calendar.getInstance().getTime()));
            }
        });

    }

    public void motionText(){


        if(asx) {
            textJLabel.setLocation(X_text++, Y_text);

            if(X_text == 215){
                asx = false;
            }
        }
        if(!asx){
            textJLabel.setLocation(X_text--, Y_text);
            if(X_text == 0){
                asx = true;
            }
        }

        if(asy) {
            textJLabel.setLocation(X_text, Y_text++);

            if(Y_text == 480){
                asy = false;
            }
        }
        if(!asy){
            textJLabel.setLocation(X_text, Y_text--);

            if(Y_text == 0){
                asy = true;
            }
        }
    }
}
