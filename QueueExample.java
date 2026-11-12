import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue p1 = new PriorityQueue<>();
        p1.add(10);
        p1.add(50);
        p1.add(500);
        p1.add(400);
        p1.add(40);
        // p1.add("hello");
        // // p1.add(null);
        // System.out.println(p1);
        // System.out.println(p1.poll());
        // 
        // System.out.println(p1.poll());
        // p1.clear();
        // System.out.println(p1);


        //without using lambda function and using method reference
        p1.forEach(System.out::println);

        //syntax: method reference 
            //         className :: methodName 
        
        
        //with using lambda function    -> syntax : variableName-> expression
        p1.forEach(x-> System.out.println(x));

    }
}
