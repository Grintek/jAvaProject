package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args){
        HashMap<String, String> hash = new HashMap<String, String>();

        hash.put("read", "красный");
        hash.put("blue", "синий");
        hash.put("black", "черный");
        System.out.println(hash);

        System.out.println(hash.containsKey("black"));

        int a = 1244214;
        byte b = (byte) a;
        System.out.println(b);
    }
}
