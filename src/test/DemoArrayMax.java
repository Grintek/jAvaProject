package test;

public class DemoArrayMax {
    public static void main(String[] args){
        int[] sample = {12, 20, 49, 15, 59, 43, 25, 9, 5, 11};

        int max = sample[0];

        for(int i = 0; i < sample.length; i++){

            if(max > sample[i]){
                max = sample[i];
            }
        }
        System.out.println(max);
    }
}
