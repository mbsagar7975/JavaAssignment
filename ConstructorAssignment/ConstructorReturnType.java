public class ConstructorReturnType {

    // These are methods, NOT constructors

    int ConstructorReturnType() {
        System.out.println("Method with int Return Type");
        return 100;
    }

    String ConstructorReturnType(String name) {
        System.out.println("Method with String Return Type");
        return name;
    }
}