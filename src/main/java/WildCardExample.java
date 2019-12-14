import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        List<Animals> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animals(1));
        listOfAnimals.add(new Animals(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);
    }

    /*
        Object
            Animals
                Dog
     */


    private static void test(List<? extends Animals> list) { // ? - любой объект наследуемый от Animals
        for (Animals animal : list) {
            animal.eat();
        }
    }

    private static void test2(List<? super Animals> list) { // ? - любой объект предок Animals (в данный момент только Object)
//        for (Animals animal : list) {
//            System.out.println(animal);
//        }
    }
}

