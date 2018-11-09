package week9;
import java.io.*;
import java.io.FileWriter;
public class Utils {

    public static String readContentFromFile(String path) {
        String s = "";
        try {
            File fi = new File(path);
            FileReader fil = new FileReader(fi);
            BufferedReader br = new BufferedReader(fil);
            String line;
            while ((line = br.readLine()) != null) {
                s = s + line;
            }
            br.close();
        } catch (Exception d) {
            System.out.println("Loi doc jile" + d);
        }
        return s;
    }

    public static void writeContentToFile(String path) {
        String a = "hello";
        try {

            File file1 = new File(path);
            PrintWriter pw = new PrintWriter(file1);
            pw.println(a);
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void writeFile(String path) {
        String a = " the vao cuoi";
        String b = a;
        try {
            FileWriter fil = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fil);
            pw.write(a);
            pw.write(b);
            pw.close();
        } catch (Exception h) {
            System.out.println(h);
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        try {
            File file2 = new File(folderPath);
            for (File f : file2.listFiles()) {
                if (f.getName().equals(fileName)) ;
                return new File(f.getName());
            }
        }
        catch (Exception j) {
            System.out.println(j);
        }
        return null;
    }

    public static void main(String[] args) {

        writeContentToFile("C:\\duong.txt");

       writeFile("C:\\duong.txt");

        System.out.println(readContentFromFile("C:\\duong.txt"));

       System.out.println(findFileByName("C:\\duong","Week.txt"));


    }

    }



