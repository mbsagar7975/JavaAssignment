public class ConstructorExample {

    // Public Constructor
    public ConstructorExample() {
        System.out.println("Public Constructor");
    }

    // Default Constructor
    ConstructorExample(int a) {
        System.out.println("Default Constructor : " + a);
    }

    // Protected Constructor
    protected ConstructorExample(int a, int b) {
        System.out.println("Protected Constructor : " + a + " " + b);
    }

    // Private Constructor
    private ConstructorExample(String name) {
        System.out.println("Private Constructor : " + name);
    }

    // Method to access Private Constructor
    public static void callPrivateConstructor() {
        new ConstructorExample("Java");
    }
}