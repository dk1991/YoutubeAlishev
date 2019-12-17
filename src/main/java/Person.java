import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -410327356646184591L;

    // используется для того, чтобы пометить состояние класса
    // меняем это поле, когда существенно меняем класс!!!
    //private static final long serialVersionUID = -4211676892675380276L;

    private /*transient*/ int id; // При сериализации приравнивается к 0. (для примитивов будет значение по умолчанию)
    private /*transient*/ String personName; // Это поле не будет Сериализованно!. При сериализации будет приравнено к null
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + personName + '\'' +
                '}';
    }
}
