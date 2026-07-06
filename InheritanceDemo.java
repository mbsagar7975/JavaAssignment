public class InheritanceDemo {

    public static void main(String[] args) {

        // Object of Class A
        System.out.println("----- Object of A -----");
        A objA = new A();
        objA.methodA1();
        objA.methodA2();
        objA.display();
        System.out.println("Data Member : " + objA.number);

        // Object of Class B
        System.out.println("\n----- Object of B -----");
        B objB = new B();
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.display();
        System.out.println("Data Member : " + objB.number);

        // Object of Class C
        System.out.println("\n----- Object of C -----");
        C objC = new C();
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.display();
        System.out.println("Data Member : " + objC.number);

        // Runtime Polymorphism (Method Overriding)
        System.out.println("\n----- Runtime Polymorphism -----");

        A ref;

        ref = new B();
        ref.display();

        ref = new C();
        ref.display();

        // Runtime Polymorphism with Data Members
        System.out.println("\n----- Data Members -----");

        A ref1 = new B();
        System.out.println("A Reference to B Object : " + ref1.number);

        A ref2 = new C();
        System.out.println("A Reference to C Object : " + ref2.number);

        B ref3 = new C();
        System.out.println("B Reference to C Object : " + ref3.number);
    }
}