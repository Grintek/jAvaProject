package intefeysTest;

public class MyClass {
    public static void main(String[] args){
        FoxMove foxMove = new FoxMove("Bon");
        FoxMove fox = new FoxMove("son");


        System.out.println(foxMove.getClass());
        System.out.println(foxMove.equals(fox));

        FoxMove fox1 = new FoxMove("son");

        System.out.println(fox.equals(fox1));

    }
}
