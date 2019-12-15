import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Дмитрий" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        /*while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();*/

        String path2 = separator + "Users" + separator + "Дмитрий" + separator + "Desktop" + separator + "test2.txt";
        File file2 = new File(path2);
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();

        String[] numbers = line.split(" ");
        int[] nums = new int[3];
        int counter = 0;
        for (String number : numbers) {
            nums[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(nums));

        scanner.close();

        File file3 = new File("test3.txt"); // файл в папке проекта
        Scanner scanner3 = new Scanner(file3);
        String line3 = scanner3.nextLine();
        System.out.println(line3);
        scanner3.close();
    }
}

