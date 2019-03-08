package test;
//Многомерные масивы
public class DemoArrayArrayArray {
    public static void main(String[] args){
// константа для массива
        final int SIZE = 5;
// создаем массив в котором есть другие массивы
        // причем другие массивы равны null
        char[][] as = new char[SIZE][];
//цикл по элементам массива, пока они равны null
        for (int i = 0; i < as.length; i++){
            // проверяем на null, если да то это правда
            System.out.println(as[i] == null);
        }

        for (int i = 0; i < as.length; i++){
            // создаем случайное число от 25 до 75 для указания размера массива
            int size = (int)(Math.round(Math.random()*50) + 25);
            // теперь создаем размер нужного массива
            as[i] = new char[size];
        }

        //цикл по элементам массива - все они теперь проинициализированы
        for (int i = 0; i < as.length; i++){
            //выводи размер массива
            System.out.println(as[i].length);
        }






// ТУТ РИСУЕТСЯ ФИГУРА
//        for (int i = 0; i < SIZE; i++){
//            for (int t = 0; t < SIZE; t++){
//                if(t == (SIZE/2) - i || t == (SIZE/2) + i || (i >= SIZE/2 & (t == i - SIZE/2 || t == SIZE - (i - SIZE/2 + 1)))){
//                    as[i][t] = '#';
//                }else{
//                    as[i][t] = ' ';
//                }
//
//            }
//        }
//        // выводим массив на экран
//        // цикл по первой размерности выводит строки
//        for (int i = 0; i < SIZE; i++){
//            for (int t = 0; t < SIZE; t++){
//                System.out.print(as[i][t]);
//            }
//            System.out.println();
//        }

    }
}
