package test;

public class ArraySpiral {
    public static void main(String[] args){
        //размер массива
        final int SIZE = 14;
        int max = SIZE * SIZE;
        //многомерный массив
        int[][] spiral = new int[SIZE][SIZE];

        int[] y = new int[SIZE];
        int[] x = new int[SIZE];
//смещение на 1;
        x[3] = 1;
        y[1] = x[1] = SIZE - 1;
        //заполняем массив

        for(int i = 0; i < max; i++) {
            spiral[y[2]][x[2]] = i + 1;
            //изменение положение на спирали

            y[2] = y[2] + y[3];
            x[2] = x[2] + x[3];

            if (y[3] == 0) {
                if(x[2] > x[0] && x[3] == 0){
                    x[3] = 1;
                }else
                if (x[2] > y[1] - 1 && x[3] > 0) {
                    x[3] = 0;

                }else if(x[2] == x[0] && x[3] < 0 ){
                        x[3] = 0;
                        x[0]++;
                }

                else if(x[2] > y[1] - 1 && x[3] == 0 && y[2] == y[1])
                {
                    x[3] = -1;

                }

            }

            if (x[3] == 0) {
                if (y[2] > y[1] - 1 && y[3] > 0 ) {
                    y[3] = 0;
                    x[3] = -1;
                    y[0]++;
                    y[1]--;



                }else if(y[2] == y[0] && y[3] < 0  ){
                        y[3] = 0;
                        x[3] = 1;

                }else if(y[2] < y[1] && y[3] == 0){
                    y[3] = 1;

                }else if(y[2] > y[0] && y[3] == 0) {
                    y[3] = -1;

                }

            }

        }


        for(int i = 0; i < spiral.length; i++){
            for(int t = 0; t < spiral.length; t++) {
                    System.out.format("%5d", spiral[i][t]);
            }
            System.out.println();
        }

    }
}
