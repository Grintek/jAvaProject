package threadTest;

class EggVoice extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            try {
                sleep(1000);
            }catch (InterruptedException e) {}
            System.out.println("яйцо");

        }
    }
}

public class ChickenVoice {
    static EggVoice eggVoice;

    public static void main(String[] args){
        eggVoice = new EggVoice();
        System.out.println("спор начат");
        eggVoice.start();

        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){ }

            System.out.println("Курицы!");
        }

        if(eggVoice.isAlive()){
            try {
                eggVoice.join();
            } catch (InterruptedException e) {}

            System.out.println("первым появилось яйцо");

        }
        else
        {
            System.out.println("Первыой появилась курица");
        }
        System.out.println("спор окончен");
    }
}
