import java.io.*;
import java.sql.SQLException;

public class ExceptionsDemo {

    // 3. Method that throws exception
    static void throwMethod() throws Exception {
        throw new Exception("Exception from throwMethod()");
    }

    public static void main(String[] args) throws Exception {

        // 1. Arithmetic Exception (Without Handling)
        System.out.println("1. Arithmetic Exception (Without Handling)");
        // Uncomment to test
        // int a = 10 / 0;

        // 2. Arithmetic Exception using try-catch
        System.out.println("\n2. Arithmetic Exception with Try-Catch");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // 3. Method throws exception
        System.out.println("\n3. Method Throws Exception");
        // Uncomment to test
        // throwMethod();

        // 4. Multiple Catch Blocks
        System.out.println("\n4. Multiple Catch Blocks");
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        // 5. Throw Exception with Own Message
        System.out.println("\n5. Throw Exception with Own Message");
        try {
            throw new Exception("My Own Exception Message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 6. Custom Exception
        System.out.println("\n6. Custom Exception");
        try {
            throw new CustomException("This is Custom Exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // 7. Finally Block
        System.out.println("\n7. Finally Block");
        try {
            int a = 10 / 2;
            System.out.println(a);
        } finally {
            System.out.println("Finally Block Executed");
        }

        // 8. Arithmetic Exception
        System.out.println("\n8. Arithmetic Exception");
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // 9. ArrayIndexOutOfBoundsException
        System.out.println("\n9. ArrayIndexOutOfBoundsException");
        try {
            int arr[] = {1,2,3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // 10. ClassNotFoundException
        System.out.println("\n10. ClassNotFoundException");
        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        // 11. FileNotFoundException
        System.out.println("\n11. FileNotFoundException");
        try {
            FileInputStream file = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // 12. IOException
        System.out.println("\n12. IOException");
        try {
            FileReader file = new FileReader("abc.txt");
            file.close();
            file.read();
        } catch (IOException e) {
            System.out.println(e);
        }

        // 13. NoSuchFieldException
        System.out.println("\n13. NoSuchFieldException");
        try {
            Class<?> c = String.class;
            c.getField("abc");
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        }

        // 14. NoSuchMethodException
        System.out.println("\n14. NoSuchMethodException");
        try {
            Class<?> c = String.class;
            c.getMethod("abc");
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }

        // 15. NullPointerException
        System.out.println("\n15. NullPointerException");
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        // 16. NumberFormatException
        System.out.println("\n16. NumberFormatException");
        try {
            int num = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // 17. StringIndexOutOfBoundsException
        System.out.println("\n17. StringIndexOutOfBoundsException");
        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // 18. SQLException
        System.out.println("\n18. SQLException");
        try {
            throw new SQLException("Database Connection Failed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}