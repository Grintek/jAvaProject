package test.generic.queue;

public class ObjectQueue<T> {

    // указать на первый элемент
    private ObjectBox<T> head = null;
    // указать на последний элемент
    private ObjectBox<T> tail = null;



    // Поле для указание хранения очереди
    private int size = 0;

    //добавляем
    public void push(T obj){
        //создаем вспомагательный обьект и помещаем в него новый элемент
        ObjectBox<T> ob = new ObjectBox<>();
        ob.setObject(obj);
        //если очередь пустая - в ней еще нет элемента
        if(head == null){
            //теперь наша голова указывает на первый элемент
            head = ob;
        }else{
            // Если это не первый элемент, то надо, чтобы чтобы последний элемент
            // указывал на новый элемент в очереди
            tail.setNext(ob);
        }
        // перепещаем последний элемент на новый
        tail = ob;
        // увеличиваем размер нашей очереди
        size++;
    }
    //вытаскиваем
    public T pull(){
        //есди нет элементов то возвращаем null
        if (size == 0){
            return null;
        }
        //получам наш обьект из вспомогательного класса, из головы
        T obj = head.getObject();
        //перемещаем голову на следующий элемент
        head = head.getNext();
        //если это единственный элемент, то  head станет null
        // и тогда tail тоже будет null
        if(head == null){
            tail = null;
        }
        //уменьшаем размер очереди
        size--;

        return obj;
    }
    public int size() {
        return size;
    }
    public T get(int index){
        //если нет элементов или индекс больше значения или индекс меньше 0
        if (size == 0 || index >= size || index < 0 ){
            return null;
        }
        //установим указатель, который будет перемещать наголову
        ObjectBox<T> current = head;
        // в этом случае позиция равна 0
        int pos = 0;
        // пока позиция недостигла нужного индекса
        while (pos < index){
            //премещаем на следующий элемент
            current = current.getNext();
            //увеличиваем позицию
            pos++;
        }
        // мы дошли до нужной позиции, теперь можно вернуть элемент
        T obj = current.getObject();
        return obj;
    }


}
