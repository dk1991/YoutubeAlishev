import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        /*try {
            //FileInputStream fis = new FileInputStream("people.bin");
            FileInputStream fis = new FileInputStream("people2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            *//*Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();*//*

            // Прочитать массив объектов - 1 способ
            *//*int personCount = ois.readInt();
            Person[] people = new Person[personCount];
            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }*//*

            // Чтение массива, записанного как объект - 2 способ
            Person[] people = (Person[]) ois.readObject();

            ois.close();

            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        // try с ресурсами - НЕ надо писать метод ois.close(); - это выполнится автоматически
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people2.bin"))) {
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
