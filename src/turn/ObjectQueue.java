package turn;

public class ObjectQueue {
    //Указывает на первый элемент
    private ObjectBox head = null;
    //Указывает на последний элемент
    private ObjectBox tail = null;
    //Поле для хранения размера очереди
    private int size = 0;

    public void push(Object obj){
        //сразу создаеи вспомогательный объект и помещаем в него новый элемент
        ObjectBox objectBox = new ObjectBox();
        objectBox.setObject(obj);
        //если очередь пустая - в ней еще нет элементов
        if(head == null){
            // теперь наша голова указывает на первый элемент
            head = objectBox;
        }else{
            // Если это не первый элемент, то надо, чтобы последний элемент в очереди
            // указывал на вновь прибывший элемент
            tail.setNext(objectBox);
            // а вновь прибывший указываем а преведущий
            objectBox.setPrev(tail);
        }
        // И в любом случае нам надо наш "хвост" переместить на новый элемент
        // Если это первый элемент, то "голова" и "хвост" будут указывать на один и тот же элемент

        tail = objectBox;
        // Увеличиваем размер нашей очереди
        size++;

    }

    public Object pull() {
        // Если у нас нет элементов, то возвращаем null
        if(size == 0){
            return null;
        }
        // Получаем наш объект из вспомогательного класса из "головы"
        Object obj = head.getObject();
        // Перемещаем "голову" на следующий элемент
        head = head.getNext();
        // Если это был единственный элемент, то head станет равен null
        // и тогда tail (хвост) тоже дожен указать на null.
        if(head == null){
            tail = null;
        }
// Уменьшаем размер очереди
        size--;
// Возвращаем значение
        return obj;
    }

    public Object pullBack(){
        // Если у нас нет элементов то возвращаем ull
    Object ob = tail.getObject();
    //Перемещаем хвост на преведущий элемент
    tail = tail.getPrev();
        // Если это был единственный элемент, то teil станет равен null
        // и тогда head (хвост) тоже дожен указать на null.
    if(tail == null) {
        head = null;
    }
    // Уменьшаем размер очереди
                size--;
        //// Возвращаем значение
        return ob;


    }

    public Object get(int index){
        // Если нет элементов или индекс больше размера или индекс меньше 0
        if(size == 0 || index >= size || index < 0){
            return null;
        }
        if(index < size / 2) {
            // Устанавлваем указатель, который будем перемещать на "голову"
            ObjectBox current = head;
            // В этом случае позиция равну 0
            int pos = 0;
            // Пока позиция не достигла нужного индекса
            while (pos < index) {
                // Перемещаемся на следующий элемент
                current = current.getNext();
                // И увеличиваем позицию
                pos++;
            }
            // Мы дошли до нужной позиции и теперь можем вернуть элемент
            Object obj = current.getObject();
            return obj;
        }else {
            // Устанавливаем указатель который буде перемещать на хвост
            ObjectBox current = tail;

            int pos = size - 1;

            while (pos > index){
                //переносим на преведущий элемент
                current.getPrev();
                //уменьшаем позицию
                pos--;
            }
            // мы дошли до нужной позиции
            Object obj = current.getObject();
            return obj;
        }
    }

    public int size() {
        return size;
    }
    // Наш вспомогательный класс будет закрыт от посторонних глаз
    private class ObjectBox {
        // Поле для хранения объекта
        private Object object;
        // Поле для указания на следующий элемент в цепочке.
        // Если оно равно NULL - значит это последний элемент
        private ObjectBox next;
        //Поле для указание на преведущий элемент
        private ObjectBox prev;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object){
            this.object = object;
        }
        public ObjectBox getNext() {
            return next;
        }
        public ObjectBox getPrev() {
            return prev;
        }

        public void setNext(ObjectBox next) {
            this.next = next;
        }

        public void setPrev(ObjectBox prev) {
            this.prev = prev;
        }
    }
}
