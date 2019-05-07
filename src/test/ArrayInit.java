package test;

public class ArrayInit {
    public static void main(String[] args){
        //создание одномерного массива чисел
        int[] a = {1, 2, 56, 78, 34, 12, 89};

        // Создание двумерного массива символов
        // Обратите внимание на фигурные скобки для выделения
        //  массивов внутри массива. Второй массив - пустой
        char[][] graph = {{'1', 'R', 'H', '&', '5', '@'}, {}, {'L', 'O', 'L','I' },{}, {'E', '2', 'U'}};

        // Печать массива символов через конструкцию foraech
        // Проходим по элеметам массива массивов - т.е. получаем
        // одномерный массив при каждом цикле
        for(char[] g1 : graph) {
            for (char g2 : g1){
                //печатаем строку из массива
                System.out.print(g2);
            }
            //переходим на следующую строку
            System.out.println();
        }

        String string = new String("qwr");
        String sd = new String("qwr");

            System.out.println(sd.equals(string));


    }
}
