import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteExample {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test2.txt");

        PrintWriter pw = new PrintWriter(file); // только для записи текстовых значений

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }
}

