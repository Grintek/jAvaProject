package test.generic.no;

public class WorkGeneric {
    public static void main(String[] args){
        SimpleGeneric simp = new SimpleGeneric();
        simp.setElement("123124");
        Object s = simp.getElement();

        System.out.println(s);
    }
}
