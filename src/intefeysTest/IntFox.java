package intefeysTest;

public interface IntFox {
    public void foxen();
    String as = "asss";

    default void index(){
        System.out.println("123" + as);
    }

    default void zero(){
        int a = 2;
        a++;
        System.out.println(a);
    }
}
