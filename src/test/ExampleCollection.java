package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExampleCollection {
    public static void main(String[] args) {
        Collection coll1 = createFirstCollection();
        Collection coll2 = createSecondCollection();

        System.out.println("======= ПРОХОД ПО КОЛЕКЦИИ");

        for(Object o : coll1){
            System.out.println("item: " + o);
        }

        System.out.println();

        System.out.println("========= ПРОХОД ПО КОЛЕКЦИИ ЧКРЕЗ ИНТЕРАТОР");

        for(Iterator it = coll1.iterator(); it.hasNext();){
            String s = (String) it.next();
            System.out.println("interator: " + s);
        }
        System.out.println();

        System.out.println("========== ГРУПОВЫЕ ОПЕРАЦИИ");

        // проверим содержаться ли все элеметы col2 в кол 1

        if(coll1.containsAll(coll2)){
            System.out.println("Коллекция col1 содержит все от коллекции col2 ");
        }
        System.out.println();

        System.out.println("========== ДоБАВИМ ВСЕ ЭЛЕМЕНТЫ В coll1 из coll2");
        coll1.addAll(coll2);
        for (Object o : coll1){
            System.out.println("Item: " + o);
        }
        System.out.println();

        System.out.println("============Удалени элементов из coll1");
        coll1.removeAll(coll2);
        for (Object o: coll1){
            System.out.println("Item: " + o);
        }
        System.out.println();
        System.out.println("=========Пресоздаем колекции");
        //пересоздаем колекцию для дальнейшир тестов
        coll1 = createFirstCollection();
        coll2 = createSecondCollection();

        System.out.println();

        System.out.println("========= delete first item");
        coll1.remove("1");

        for (Object o : coll1){
            System.out.println("item: " + o);
        }
        System.out.println();

        System.out.println("=======");

    }

    public static Collection createFirstCollection(){
        Collection col = new ArrayList();
        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        col.add("7");
        col.add("8");
        col.add("9");
        return col;
    }

    public static Collection createSecondCollection(){
        Collection col2 = new ArrayList();
        col2.add("1");
        col2.add("2");
        col2.add("3");
        col2.add("4");
        return col2;
    }
}
