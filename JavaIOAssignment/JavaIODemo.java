import java.io.*;
import java.util.Properties;

// For Excel (Apache POI)
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaIODemo {

    public static void main(String[] args) {

        // 1. InputStream
        System.out.println("1. Read using InputStream");
        try {
            FileInputStream fis = new FileInputStream("input.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // 2. OutputStream
        System.out.println("\n\n2. Write using OutputStream");
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");

            String text = "Hello Java IO";

            fos.write(text.getBytes());

            fos.close();

            System.out.println("Data Written Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }

        // 3. BufferedInputStream
        System.out.println("\n3. BufferedInputStream");
        try {
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream("input.txt"));

            int ch;

            while ((ch = bis.read()) != -1) {
                System.out.print((char) ch);
            }

            bis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // 4. BufferedOutputStream
        System.out.println("\n\n4. BufferedOutputStream");

        try {

            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream("output.txt"));

            String text = "Buffered Output Stream";

            bos.write(text.getBytes());

            bos.close();

            System.out.println("Written Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }

        // 5. FileReader
        System.out.println("\n5. FileReader");

        try {

            FileReader fr = new FileReader("input.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // 6. FileWriter
        System.out.println("\n\n6. FileWriter");

        try {

            FileWriter fw = new FileWriter("output.txt");

            fw.write("Writing using FileWriter");

            fw.close();

            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }

        // 7. BufferedReader
        System.out.println("\n7. BufferedReader");

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("input.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // 8. BufferedWriter
        System.out.println("\n8. BufferedWriter");

        try {

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("output.txt"));

            bw.write("Writing using BufferedWriter");

            bw.close();

            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }

        // 9. Properties File
        System.out.println("\n9. Properties File");

        try {

            Properties p = new Properties();

            FileInputStream fis =
                    new FileInputStream("config.properties");

            p.load(fis);

            System.out.println("Name : " + p.getProperty("name"));

            System.out.println("City : " + p.getProperty("city"));

            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // 10. Read Excel
        System.out.println("\n10. Read Excel");

        try {

            FileInputStream file =
                    new FileInputStream("sample.xlsx");

            Workbook wb = new XSSFWorkbook(file);

            Sheet sheet = wb.getSheetAt(0);

            Row row = sheet.getRow(0);

            Cell cell = row.getCell(0);

            System.out.println(cell);

            wb.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // 11. Write Excel
        System.out.println("\n11. Write Excel");

        try {

            Workbook wb = new XSSFWorkbook();

            Sheet sheet = wb.createSheet("Student");

            Row row = sheet.createRow(0);

            Cell cell = row.createCell(0);

            cell.setCellValue("Java IO");

            FileOutputStream fos =
                    new FileOutputStream("sample.xlsx");

            wb.write(fos);

            wb.close();

            fos.close();

            System.out.println("Excel Written Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}