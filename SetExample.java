import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
            new TreeSetExample().displayTreeSetProperties();
           new HashSetExample().displayHashSetProperties();
           new LinkedHashSetExample().displayLinkedHashSetProperties();
    }
}
//LinkedHashSet Example 


class LinkedHashSetExample{
    void displayLinkedHashSetProperties(){
        LinkedHashSet lh1=new LinkedHashSet();
        lh1.add(10);
        lh1.add("java");
        lh1.add(null);
        System.out.println(lh1);
    }
}



//HashSet Example 
class HashSetExample{
    void displayHashSetProperties(){
           Set h1=new HashSet();
           h1.add(10);
           h1.add(20);
           h1.add(20);
           h1.add("hello");
           h1.add("hello");
           h1.add(true);
           h1.add(null);
           System.out.println(h1);
    }
}





class TreeSetExample{
    void displayTreeSetProperties(){
        TreeSet t1=new  TreeSet();
        t1.add(10);
        t1.add(10);
        t1.add(10);
        t1.add(50);
        t1.add(2);
        t1.remove(10);
        System.out.println(t1);
        t1.clear();
        // t1.add(null); it not allows
        System.out.println(t1);
        System.out.println(t1.isEmpty());
    }
}


