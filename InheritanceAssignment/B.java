public class B extends A {

    // Instance Variable
    int number = 200;

    // Specific Method 1
    public void methodB1() {
        System.out.println("Method B1");
    }

    // Specific Method 2
    public void methodB2() {
        System.out.println("Method B2");
    }

    // Override Method
    @Override
    public void display() {
        System.out.println("Display Method of Class B");
    }
}