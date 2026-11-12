import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap tm1 = new TreeMap();
       
        tm1.put("Name", "Ravi");
        tm1.put("RollNo", "2026CSE001");
        tm1.put("College ", "APS");
        tm1.put("College Code", "APS");
        System.out.println(tm1);
        System.out.println(tm1.get("Name"));
        
        HashMap<Character,String> tm2 = new HashMap();
        tm2.put('3', "Cassandra");
        tm2.put('7', "neo4j");
        tm2.put('2', "MongoDB");
        tm2.put('4', "HBase");
        tm2.put('1', "Sql");
        tm2.put('5', "FireBase");
        tm2.put('6', "neon");
        tm2.put('8', null);
        tm2.put(null, null);

        System.out.println(tm2);

    }
}
