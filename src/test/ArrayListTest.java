package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {

    String lvl;
    private String str1;

    public ArrayListTest(String lvl){
        this.lvl = lvl;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(4);
        list.add(345);
        list.add(23);
        list.add(36);
        list.add(78);

        for(int a : list){
        System.out.println(a);
        }
        LinkedList<ArrayListTest> arrayListTests = new LinkedList<>();
        ArrayListTest str1 = new ArrayListTest("Hello");
        ArrayListTest str2 = new ArrayListTest("My name is Name");
        ArrayListTest str3 = new ArrayListTest("Hello cc");
        ArrayListTest str4 = new ArrayListTest("Hellorehdrf");
        ArrayListTest str5 = new ArrayListTest("Helloshgaer");
        ArrayListTest str6 = new ArrayListTest("Hellodgagr");


        arrayListTests.add(str1);
        arrayListTests.add(str2);
        arrayListTests.add(str3);
        arrayListTests.add(str4);
        System.out.println(arrayListTests);
        arrayListTests.addFirst(str5);
        arrayListTests.addLast(str6);

        System.out.println(arrayListTests);

    }

    public String toString(){
        return "ArrayListTest{" +
                "model='" + lvl + '\'' +
                '}';
    }
}
/*
Придумать эффективный алгоритм удаления группы рядом стоящих элементов из аррай Листа
 */
