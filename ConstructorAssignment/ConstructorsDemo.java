public class ConstructorsDemo {

    public static void main(String[] args) {

        System.out.println("Question 1");
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 = new ConstructorExample(10);
        ConstructorExample obj3 = new ConstructorExample(10, 20);

        System.out.println("\nQuestion 2");
        Child child1 = new Child();
        Child child2 = new Child(50);

        System.out.println("\nQuestion 3");
        ConstructorExample.callPrivateConstructor();

        System.out.println("\nQuestion 4");
        ConstructorReturnType obj = new ConstructorReturnType();
        obj.ConstructorReturnType();
        obj.ConstructorReturnType("Java");

        System.out.println("\nQuestion 5");
        System.out.println("Constructor cannot be called again using the same object.");
        System.out.println("Creating another object calls the constructor again.");

        obj1 = new ConstructorExample();
    }
}