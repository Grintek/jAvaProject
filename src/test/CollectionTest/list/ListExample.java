package test.CollectionTest.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    static public void main(String[] args){
        //создаем простой список
        List<String> list = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            list.add("String:  " + i);
        }

        System.out.println(); // отступ

        System.out.println("Печать через цикл foreach");
        for(String s : list){
            System.out.println(s);
        }
        ///////////////////////////////////////////////////
        System.out.println();
        System.out.println("================================ Через Iterator");
        for (Iterator<String> it = list.iterator(); it.hasNext();){
            String st = it.next();
            System.out.println(st);
        }
        ////////////////////////////////////////////////////
        System.out.println();
        System.out.println("================================ Через ListIterator во всех направлениях");

        System.out.println("от конца к началу");
        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();){
            String st = it.previous();
            System.out.println(st);
        }
        System.out.println();

        System.out.println("от начала в конец");
        for(Iterator<String> it = list.listIterator(); it.hasNext();){
            String st = it.next();
            System.out.println(st);
        }

        System.out.println();
        //печать через индекс элемента
        System.out.println("печать через индекс элемента");
         for (int i = 0; i<list.size(); i++){
             String s = list.get(i);
             System.out.println(s);
         }

    }
}
