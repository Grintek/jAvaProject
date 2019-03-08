package lifo;

public class Post {

    private Ring header = null;
    // указываем на верхнее кольцо
    private Ring newRing = null;

    // количество колец на столбе
    public int size = 0;

    public void push(Object object){
        Ring ring = new Ring();
        ring.setObject(object);
        // если нет элементов в очереди возвращаем null
        if(header == null){
            // первое кольцо которое потом окажется в низу столба
            header = ring;
        }else {
            //по верх старого кольца кидаем новое
            ring.setNext(newRing);
            //newRing.setNext(ring);
        }
// добавляем следующее кольцо
        newRing = ring;
//  прибовляем к длине
        size++;

    }

    public Object pull(){
        // если список равен 0 тогда возвращаем null
        if(size == 0){
            return null;
        }
        // вытягиваем верхнее кольцо
        Object obj = newRing.getObject();
        //
        newRing = newRing.getNext();

        size--;

        return obj;
    }
    public int getSize() {
        return size;
    }

    // внутренний КЛАСС кольца
    private class Ring{
        // поле для хранения объекта
        private Object object;

        private Ring next;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public Ring getNext() {
            return next;
        }

        public void setNext(Ring next) {
            this.next = next;
        }
    }
}
