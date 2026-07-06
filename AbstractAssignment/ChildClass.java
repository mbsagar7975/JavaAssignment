public class ChildClass extends AbstractClass {

    // Implementing Abstract Method
    @Override
    void abstractMethod() {
        System.out.println("Abstract Method Implemented");
    }

    public static void main(String[] args) {

        // 2. Object of Abstract Class using Child Class
        AbstractClass obj1 = new ChildClass();

        System.out.println("Calling Non-Abstract Methods using Abstract Class Reference");
        obj1.display();
        obj1.show();

        // 3. Object of Child Class and Call Abstract Method
        ChildClass obj2 = new ChildClass();

        System.out.println("\nCalling Abstract Method using Child Class Object");
        obj2.abstractMethod();

        // 4. Object of Child Class and Call Non-Abstract Methods
        System.out.println("\nCalling Non-Abstract Methods using Child Class Object");
        obj2.display();
        obj2.show();
    }
}