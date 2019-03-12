package test;

public class ArraySpiral2 {
    public static void main(String[] args){
        //размер массива
        final int SIZE = 4;
        int max = SIZE * SIZE;
        //многомерный массив
        int[][] spiral = new int[SIZE][SIZE];
        int top = 0;
        int left = 0;
        for(int i = 0; i < max; i++) {


        }


        for(int i = 0; i < spiral.length; i++){
            for(int t = 0; t < spiral.length; t++) {
                System.out.format("%3d", spiral[i][t]);
            }
            System.out.println();
        }

    }
}
