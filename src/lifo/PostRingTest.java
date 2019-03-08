package lifo;

public class PostRingTest {

    public static void main(String[] args){
        Post post = new Post();
        for(int i=0; i < 10; i++){

            post.push("кольцо " + i);
        }

        while (post.getSize() > 5) {
            String a = (String) post.pull();
            System.out.println(a);
            System.out.println(post.getSize());
        }
    }
}
