import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add(10);  //0
        a1.add(30);// 1
        a1.add(50);// 2
        a1.add(50);// 3
        a1.add(50);// 4
        a1.add(10); //add method used to insert single element into arraylist
        System.out.println(a1);
        System.out.println(a1.get(1));// get() method is used to get arraylist elements based on index 
        
        System.out.println(a1.contains(50));
        System.out.println(a1.isEmpty());// isEmpty use to check ArrayList Empty or not 
        System.out.println(a1.indexOf(50));//
       

        ArrayList a2=new ArrayList();
        a2.add(null);
        a2.add("hello");
        a2.add('h');
        a2.add(50);

        a1.addAll(a2);
        System.out.println(a1);
        System.out.println(a2);
        
        System.out.println(a1.containsAll(a2));
        
        a1.remove(1);
        a1.remove("hello");
        System.out.println(a1);

        a1.removeAll(a2);
        System.out.println(a1);
        a1.clear();




        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(50);
        arr1.add(100);
        arr1.add(150);
        arr1.add(null);
        System.out.println(arr1);


        ArrayList<Character> ch=new ArrayList<Character>();
        ch.add(null);
        ch.add('h');
        ch.add('a');
        ch.add('6');
        ch.add((char) 97);

        System.out.println(ch);



    
    }
}
