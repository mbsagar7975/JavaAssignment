
public class PrivateChild extends PrivateClass {

    public void test() {

        // System.out.println(number);   // Error

        // display();                   // Error

        System.out.println("Private members cannot be accessed in subclass.");
    }
}