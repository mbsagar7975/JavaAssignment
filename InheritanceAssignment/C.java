public class C extends B {

    // Instance Variable
    int number = 300;

    // Specific Method 1
    public void methodC1() {
        System.out.println("Method C1");
    }

    // Specific Method 2
    public void methodC2() {
        System.out.println("Method C2");
    }

    // Override Method
    @Override
    public void display() {
        System.out.println("Display Method of Class C");
    }
}