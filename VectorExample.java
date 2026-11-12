import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add(10);
        v1.add("hello");
        v1.add(null);
        v1.add(10);
        System.out.println(v1);

        Vector<String> v2 = new Vector<>();
        v2.add("java");
        v2.add("Python");
        v2.add("node");
        v2.add("Next js");
        v2.add("Ruby");
        v2.addAll(v1);
        System.out.println(v2);
        System.out.println(v1.containsAll(v2));
    }
}
