public class Child extends Parent {

    public Child() {
        super();
        System.out.println("Child Default Constructor");
    }

    public Child(int x) {
        super(x);
        System.out.println("Child Parameterized Constructor : " + x);
    }
}