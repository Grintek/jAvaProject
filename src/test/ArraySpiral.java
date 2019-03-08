package test;

public class ArraySpiral {
    public static void main(String[] args){
        //размер массива
        final int SIZE = 4;
        int max = SIZE * SIZE;
        //многомерный массив
        int[][] spiral = new int[SIZE][SIZE];

        int[] y = new int[SIZE];
        int[] x = new int[SIZE];
//смещение на 1;
        y[3] = 1;
        y[1] = x[1] = SIZE - 1;
        //заполняем массив

        for(int i = 0; i < max; i++) {
            spiral[y[2]][x[2]] = i + 1;
            //изменение положение на спирали

            y[2] = y[2] + y[3];
            x[2] = x[2] + x[3];

            if (y[3] == 0) {
                if (x[2] > x[1]) {
                    x[3] = 0;
                }

            }

            if (x[3] == 0) {
                if (y[2] > y[1]) {
                        y[3] = 0;
                        y[2] = 0;
                    }

                }
            }


        for(int i = 0; i < spiral.length; i++){
            for(int t = 0; t < spiral.length; t++) {
                    System.out.format("%3d", spiral[i][t]);
            }
            System.out.println();
        }

    }
}
