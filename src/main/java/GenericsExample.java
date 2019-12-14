import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // до Java 5
        List animals = new ArrayList();
        Animals ourAnimal = new Animals();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(0);
        System.out.println(animal);

        // С появлением Generic
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");
        // animals2.add(ourAnimal); // не скомпилируется

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        // Java 7
        List<String> animals3 = new ArrayList<>();

    }
}

class Animal {
}
