package test.generic.queue;

public class QueueTest {
    public static void main(String[] args) {
        ObjectQueue<String> queue = new ObjectQueue<>();

        for(int i = 0; i <10; i++){
            queue.push("String: "+ i*100);
        }

        for(int i = 0; i < queue.size(); i++){
            String s = queue.get(i);
            System.out.println(s);
        }

        System.out.println("=======================");

        while (queue.size() > 0){
            String s = queue.pull();
            System.out.println(s + " The size: " + queue.size());
        }
    }
}
