package test;

public class DemoArrayInt {
    public static void main(String[] args){
        int[] sample = {12, 20, 49, 15, 59, 43, 25, 9, 5, 11};
// выставляем признак "обмена" переменных true, чтобы начать цикл
        boolean chang = true;
        // цикл будет длится до тех пор, пока при обмене неодного обмена не произошло
        while (chang){
           // надеямсе, что обмена данных небудет
            chang = false;
            // проходим по всему массиву
            for(int i = 0; i < sample.length -1; i++){
                // Если впереди стоящее число больше, чем следующее - меняем
                // их местами и выставляем признак, что был обмен
                if(sample[i] > sample[i + 1]){
                    // производим обмен с дополнительной переменной
                    int tmp = sample[i];
                    sample[i] = sample[i + 1];
                    sample[i + 1] = tmp;
                    // выставляем признак обмена в true
                    chang = true;
                }
            }
        }
        // вы водим отсортированный массив
        for (int i = 0; i<sample.length; i++){
            System.out.println(sample[i]);
        }
    }
}
