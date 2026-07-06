

import package1.PublicClass;

public class PublicTest2 {

    public static void main(String[] args) {

        PublicClass obj = new PublicClass();

        System.out.println("Public Variable: " + obj.number);

        obj.display();
    }
}