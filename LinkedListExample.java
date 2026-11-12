import java.util.LinkedList;
// import java.util.List;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<Long> l1 = new LinkedList();
        l1.add((long)10);
        // l1.add((long)"hello");
        l1.add(null);
        l1.add((long)10);
        // l1.add((long)true);
        System.out.println(l1);

        System.out.println(l1.peek());// Retrieves, but does not remove, the head of this queue, or returns null if
                                      // this queue is empty.
        l1.poll();
        l1.poll();
        
        System.out.println(l1);
    }
}
