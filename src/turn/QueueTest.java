package turn;

public class QueueTest {

    public static void main(String[] args){
        ObjectQueue objectQueue = new ObjectQueue();

        for(int i = 0; i<20; i++){
// В данном случае мы складываем в очередь строки
            objectQueue.push("String: " + i);
        }

        while (objectQueue.size() > 0){
            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
            //String s = (String)objectQueue.pull();
            String a = (String)objectQueue.pullBack();
           // System.out.println(s);
            System.out.println(a);
            //System.out.println("размер очереди: " + objectQueue.size());
           // System.out.println("по индексу get " + objectQueue.get(0));
            System.out.println(objectQueue.pull());
        }
    }

}
