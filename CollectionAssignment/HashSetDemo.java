import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Add Elements
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        set.add("HTML");
        set.add("CSS");
        set.add("SQL");
        set.add("Spring");
        set.add("Hibernate");
        set.add("React");

        System.out.println("Original HashSet");
        System.out.println(set);

        // Add Duplicate
        set.add("Java");

        // Iterator
        System.out.println("\nUsing Iterator");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // Contains
        System.out.println("\nContains Java : " + set.contains("Java"));

        // Remove
        set.remove("HTML");

        System.out.println("\nAfter Removing HTML");
        System.out.println(set);

        // Size
        System.out.println("\nSize : " + set.size());

        // Empty
        System.out.println("Is Empty : " + set.isEmpty());

        // Copy
        HashSet<String> set2 = new HashSet<>(set);

        System.out.println("\nCopied HashSet");
        System.out.println(set2);

        // Clear
        set.clear();

        System.out.println("\nAfter Clear");
        System.out.println(set);
    }
}