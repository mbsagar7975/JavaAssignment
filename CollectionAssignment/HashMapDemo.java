import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Sagar");
        map.put(102,"Rahul");
        map.put(103,"Amit");
        map.put(104,"Ravi");
        map.put(105,"Kiran");
        map.put(106,"Anil");
        map.put(107,"Deepak");
        map.put(108,"Raju");
        map.put(109,"Surya");
        map.put(110,"Vinay");

        System.out.println("Original Map");
        System.out.println(map);

        // Insert
        map.put(111,"Ajay");

        // Fetch Value
        System.out.println("\nValue of Key 105 : " + map.get(105));

        // Clone
        HashMap<Integer,String> map2 = new HashMap<>(map);
        System.out.println("\nCopied Map");
        System.out.println(map2);

        // Check Key
        System.out.println("\nContains Key 103 : " + map.containsKey(103));

        // Check Value
        System.out.println("Contains Value Ravi : " + map.containsValue("Ravi"));

        // Empty
        System.out.println("Is Empty : " + map.isEmpty());

        // Size
        System.out.println("Size : " + map.size());

        // Keys
        System.out.println("\nKeys");
        for(Integer key : map.keySet())
        {
            System.out.println(key);
        }

        // Values
        System.out.println("\nValues");
        for(String value : map.values())
        {
            System.out.println(value);
        }

        // Remove Key
        map.remove(110);
        System.out.println("\nAfter Removing Key 110");
        System.out.println(map);

        // Copy
        HashMap<Integer,String> map3 = new HashMap<>();
        map3.putAll(map);

        System.out.println("\nCopied Map using putAll()");
        System.out.println(map3);
    }
}