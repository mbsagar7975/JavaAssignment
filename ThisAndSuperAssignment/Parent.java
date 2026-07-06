public class Parent {

    int parentValue = 100;

    // Default Constructor
    Parent() {
        System.out.println("Parent Default Constructor");
    }

    // Parameterized Constructor
    Parent(int x) {
        System.out.println("Parent Parameterized Constructor: " + x);
    }

    // Parent Method
    void parentMethod() {
        System.out.println("Parent Method");
    }
}