package test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args){

        TreeMap<Integer, String> state = new TreeMap<Integer, String>();

        state.put(10, "Germany");
        state.put(2, "Spain");
        state.put(14, "France");
        state.put(3, "Italy");

        String first = state.get(2);

        for(Map.Entry<Integer, String> item : state.entrySet()){
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        System.out.println(first);

        Set<Integer> keys = state.keySet();
        System.out.println(keys);


        Map<String, Car> car = new TreeMap<String, Car>();
        car.put("1234i05", new Car("Volga"));
        car.put("1546i55", new Car("Niva"));
        car.put("2346i65", new Car("Toyota"));

        for(Map.Entry<String, Car> item : car.entrySet()){
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }

}
class Car{
    private String name;

    Car(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}