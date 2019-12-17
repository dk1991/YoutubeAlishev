import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"),
                new Person(3, "Dima"), new Person(4, "David")};

        /*try {
            //FileOutputStream fos = new FileOutputStream("people.bin"); // класс для записи байтов
            FileOutputStream fos = new FileOutputStream("people2.bin"); // класс для записи байтов
            ObjectOutputStream oos = new ObjectOutputStream(fos); // класс для записи объектов

            *//*oos.writeObject(person1);
            oos.writeObject(person2);*//*

            // 1 способ - Запись массива объектов
            //oos.writeInt(people.length); // записать в файл длину массива - число объектов
            *//*for (Person person : people) {
                oos.writeObject(person);
            }*//*

            // 2 способ - Запись массива, как объекта, т.к. массив это объект
            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // try с ресурсами - НЕ надо писать метод oos.close(); - это выполнится автоматически
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people2.bin"))) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

