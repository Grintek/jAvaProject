package test.generic.queue;
/*
  По хорошему этот класс надо сделать внутренним private классом класса ObjectQueue
*/

public class ObjectBox<T> {
   //поле для хранение обьекта теперь не определено
    private T object;

    private ObjectBox<T> next;

    //возращает обьект заранее не определенного типа Т
    public T getObject(){
        return object;
    }
    //принемает на вход обьект заранее не известного типа - Т
    public void setObject(T object) {
        this.object = object;
    }
    // метод возврвщаект указатель  на следующий элемент в цепочке, у которого
    // тоже тип пока абстракный, но такой же - Т
    public ObjectBox<T> getNext(){
        return next;
    }

    // метод принемает указатель на следующий элемент в цепочке, у которого
    // тоже тип пока абстрактный, но такойже - Т
    public void setNext(ObjectBox<T> next){
        this.next = next;
    }
}
