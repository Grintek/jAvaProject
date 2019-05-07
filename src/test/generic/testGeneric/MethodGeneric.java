package test.generic.testGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MethodGeneric {
    public <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }

    public static void main(String[] args){
        MethodGeneric mg = new MethodGeneric();

        //вызываем метод для элемента типа String
        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<>();
        String theElement1 = mg.addAndReturn(stringElement, stringList);
        System.out.println("Element 1: " + theElement1);

        //вызываем метод для Integer
        Integer integerElement = 123;
        List<Integer> integerList = new ArrayList<>();
        Integer theElement2 = mg.addAndReturn(integerElement, integerList);
        System.out.println("Element 2: " + theElement2);
    }
}
