import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add 10 Elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");
        list.add("Spring");
        list.add("Hibernate");

        System.out.println("Original ArrayList");
        System.out.println(list);

        // Add an Element
        list.add("React");
        System.out.println("\nAfter Adding Element");
        System.out.println(list);

        // Iterate using Iterator
        System.out.println("\nUsing Iterator");
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add Element at Specific Index
        list.add(2, "Oracle");
        System.out.println("\nAfter Adding at Index 2");
        System.out.println(list);

        // Remove Element
        list.remove("HTML");
        System.out.println("\nAfter Removing HTML");
        System.out.println(list);

        // Remove by Index
        list.remove(3);
        System.out.println("\nAfter Removing Index 3");
        System.out.println(list);

        // Update Element
        list.set(1, "Core Java");
        System.out.println("\nAfter Updating");
        System.out.println(list);

        // Check Element at Index
        System.out.println("\nElement at Index 2 : " + list.get(2));

        // Get Element
        System.out.println("Element at Index 5 : " + list.get(5));

        // Size
        System.out.println("Size : " + list.size());

        // Contains
        System.out.println("Contains SQL : " + list.contains("SQL"));

        // Remove All
        list.clear();
        System.out.println("After Clear : " + list);
    }
}