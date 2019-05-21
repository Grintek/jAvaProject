package threadTest.startClockstop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StartStopClock extends JFrame implements ActionListener {

    private static final String START = "START";
    private static final String STOP = "STOP";

    private final JLabel clockLabel = new JLabel();
    private ClockThread clockThread = null;

    public StartStopClock(){
        //установить заголовок
        setTitle("StartStopClock");

        //выравнваем метку
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //устанавливаем размер шрифта и передаем setFont
        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 24);
        clockLabel.setFont(f);

        //добавляем метку на основную вкладку окна
        add(clockLabel);

        //добавляем кнопки
        JButton start = new JButton("START");
        start.setActionCommand(START);
        start.addActionListener(this);
        add(start, BorderLayout.NORTH);

        JButton stop = new JButton("STOP");
        stop.setActionCommand(STOP);
        stop.addActionListener(this);
        add(stop, BorderLayout.SOUTH);

        //устанавливаем размер окна
        setBounds(400, 300, 300, 200);
    }

    public void setTime(){
        // более коректный вызов в другом потоке который отвечает за графику
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                clockLabel.setText(df.format(Calendar.getInstance().getTime()));
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(START.equals(e.getActionCommand())){
            if(clockThread == null){
                clockThread = new ClockThread(this);
                clockThread.start();
            }
        }
        if(STOP.equals(e.getActionCommand())){
            if(clockThread != null){
                clockThread.stopClock();
                clockLabel.setText("");
                clockThread = null;
            }
        }
    }

    public static void main(String[] args) {
        StartStopClock st = new StartStopClock();
        st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        st.setVisible(true);
    }

}

class ClockThread extends Thread{
    private StartStopClock stcl;
    private volatile boolean isRunning = true;

    public ClockThread(StartStopClock stcl){
        this.stcl = stcl;
    }

    public void stopClock(){
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning){
            stcl.setTime();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
