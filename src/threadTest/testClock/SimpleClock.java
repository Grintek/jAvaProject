package threadTest.testClock;

import intefeysTest.MyClass;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleClock extends JFrame {
    private JLabel clockLabel = new JLabel();
    public SimpleClock(){
        //установить заголовок
        setTitle("ClockThread");

        //выравниваем метку по горизонтали - есть такой метод у Label
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //установитьразмер шрифта
        // для этого создаем шрифт  сразу отдаем методу setFont
        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 24);
        clockLabel.setFont(f);

        //добавить метку на основую панель окна
        getContentPane().add(clockLabel);

        //установить размер окна
        setBounds(400, 300, 300, 100);

        //создаем отдельный поток который будет обновлять часы
        MyThread myTh = new MyThread();
        myTh.setClock(this);
        myTh.start();
    }


    public void setTime(){
        //создаем обьект для формирования даты
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        //устанавливаем новое значение для метки - форматируем дату в строку и устанавливаем новый текст
        clockLabel.setText(df.format(Calendar.getInstance().getTime()));
    }
    public static void main(String[] args) {
        SimpleClock simpcl = new SimpleClock();
        simpcl.setDefaultCloseOperation(EXIT_ON_CLOSE);
        simpcl.setVisible(true);
    }
}

class MyThread extends Thread{
    private SimpleClock clock;

    public void setClock(SimpleClock clock){
        this.clock = clock;
    }

    @Override
    public void run() {
        while (true) {
            clock.setTime();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }
}