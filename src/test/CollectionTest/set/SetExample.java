package test.CollectionTest.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<>();
        //заполняем коллекцию
        for(int i = 7; i > 0; i--){
            set.add("String: " +i);
        }

        //пробег по коллекции через foreach
        System.out.println("пробег по коллекции через foreach");
        for (String s : set){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("заполняем(меняем) значения");

        for(int i = 1; i < 7; i++){
            set.add("String: " + i);
        }
        //выводим значения
        for (String s : set){
            System.out.println(s);
        }
    }
}
