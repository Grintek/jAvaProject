package test;

public class TestEnum1 {
    public enum MyEnum{
        MY_TEAPOT("мой чайник"), MY_TABLE("Мой стол");

        String value;
        MyEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static void main(String[] args){
        MyEnum me = MyEnum.MY_TABLE;

        System.out.println(me);
    }
}
