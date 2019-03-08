package test;

public class ArrayNumber {
    public static void main(String[] args){
        //размер массива
        final int SIZE = 10;
        //массив в длину и ширину SIZE
        int[][] arr = new int[SIZE][SIZE];
        //переменная начало отсчета во внутреннем массиве
        int s = 1;

        for(int i = 0; i < arr.length; i++){
            //меняем переменную начало отщета для следующего внутреннего массива
            if(i != 0){
                s += SIZE;
            }
            for(int t = 0; t < arr.length; t++){

                System.out.format("%3d",arr[i][t] = t + s);

            }
            System.out.println();
        }
    }
}
