package test.generic.on;

public class WorkGeneric {
    public static void main(String[] args){
        SimpleGeneric<String> sg1 = new SimpleGeneric<>();
        sg1.setElement("12313");
        System.out.println(sg1);

        SimpleGeneric<Integer> sg2 = new SimpleGeneric<>();
        sg2.setElement(99);
        System.out.println(sg2);

    }
}
