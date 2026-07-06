

public class PrivateClass {

    private int number = 100;

    private void display() {
        System.out.println("Private Method");
    }

    public static void main(String[] args) {

        PrivateClass obj = new PrivateClass();

        System.out.println("Private Variable: " + obj.number);

        obj.display();
    }
}