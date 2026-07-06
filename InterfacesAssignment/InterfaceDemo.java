public class InterfaceDemo implements Interface1,
                                      Interface2,
                                      Interface3,
                                      Interface4,
                                      Interface5,
                                      DefaultInterface,
                                      ChildInterface,
                                      PublicInterface,
                                      StaticFinalInterface {

    // Interface1
    public void method1() {
        System.out.println("Interface1 Method");
    }

    // Interface2
    public void method2() {
        System.out.println("Interface2 Method");
    }

    // Interface2 (Second Method)
    public void method3() {
        System.out.println("Interface2 Second Method");
    }

    // Interface3
    public void show() {
        System.out.println("Interface3 Method");
    }

    // Interface4 & Interface5
    public void display() {
        System.out.println("Common Display Method");
    }

    // ParentInterface
    public void parentMethod() {
        System.out.println("Parent Interface Method");
    }

    // ChildInterface
    public void childMethod() {
        System.out.println("Child Interface Method");
    }

    // PublicInterface
    public void print() {
        System.out.println("Public Interface Method");
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();

        // 1
        System.out.println("1.");
        obj.method1();

        // 2
        System.out.println("\n2.");
        obj.method2();

        // 3
        System.out.println("\n3.");
        Interface1 i = new InterfaceDemo();
        i.method1();

        // 4
        System.out.println("\n4.");
        obj.show();
        obj.display();

        // 5
        System.out.println("\n5.");
        obj.display();

        // 6
        System.out.println("\n6.");
        obj.defaultMethod();

        // 7
        System.out.println("\n7.");
        obj.parentMethod();
        obj.childMethod();

        // 8
        System.out.println("\n8.");
        System.out.println("Number = " + number);
        System.out.println("Name = " + name);
        obj.print();

        // 11
        System.out.println("\n11.");
        System.out.println("Static Final Variable = " + VALUE);

        // 9 & 10
        System.out.println("\n9 & 10.");
        System.out.println("Not possible in Java.");
        System.out.println("Interfaces cannot be private/protected.");
        System.out.println("Interface fields are always public static final.");
    }
}