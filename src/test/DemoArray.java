package test;

public class DemoArray {
    public static void main(String[] args){
        int[] demo = new int[10];
        int leng = demo.length;
        for (int i = 0; i < leng; i++){
            System.out.println(demo[i]);

            demo[i] = 10 * (i + 1);
        }
        for (int i = 0; i < leng; i++){
            System.out.println(demo[i]);
        }
    }
}
