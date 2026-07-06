public class ThisAndSuperDemo {

    public static void main(String[] args) {

        Child obj = new Child();

        // 1. Print current class fields using this
        obj.currentClassField();

        // 2. Print parent class fields using super
        obj.parentClassField();

        // Parent and Child Methods
        obj.parentMethod();
        obj.childMethod();

        // 6. Explanation
        obj.methodDemo();
    }
}