

public class ProtectedTest {

    public static void main(String[] args) {

        ProtectedClass obj = new ProtectedClass();

        System.out.println("Protected Variable: " + obj.number);

        obj.display();
    }
}