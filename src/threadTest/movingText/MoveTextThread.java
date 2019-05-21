package threadTest.movingText;

public class MoveTextThread extends Thread {
    private MovingTextJFrame movejf;
    private boolean isStart = true;
    public MoveTextThread(MovingTextJFrame movejf){
        this.movejf = movejf;
    }
    @Override
    public void run() {
        while (isStart) {
            movejf.setTime();
            movejf.motionText();
            try {

                Thread.sleep(30);
            } catch (Exception e) {
            }

        }
    }
}
