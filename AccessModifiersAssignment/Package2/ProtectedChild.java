

import package1.ProtectedClass;

public class ProtectedChild extends ProtectedClass {

    public void test() {

        System.out.println("Protected Variable: " + number);

        display();
    }

    public static void main(String[] args) {

        ProtectedChild obj = new ProtectedChild();

        obj.test();
    }
}