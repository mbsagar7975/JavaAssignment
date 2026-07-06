public class Child extends Parent {

    int childValue = 200;

    // Default Constructor
    Child() {
        this(10);    // Calls current class parameterized constructor
        System.out.println("Child Default Constructor");
    }

    // Parameterized Constructor
    Child(int x) {
        super();     // Calls parent default constructor
        System.out.println("Child Parameterized Constructor: " + x);
    }

    // Print current class field using this
    void currentClassField() {
        System.out.println("\nCurrent Class Field");
        System.out.println("Using this      : " + this.childValue);
        System.out.println("Without object  : " + childValue);
    }

    // Print parent class field using super
    void parentClassField() {
        System.out.println("\nParent Class Field");
        System.out.println("Using super     : " + super.parentValue);
    }

    // Normal Method
    void childMethod() {
        System.out.println("Child Method");
    }

    // Question 6 Explanation
    void methodDemo() {

        System.out.println("\nthis() and super() cannot be used inside methods.");
        System.out.println("They can only be used inside constructors.");

        // this();   // Invalid
        // super();  // Invalid
    }
}