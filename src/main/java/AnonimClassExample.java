class Bird {
    public void eat() {
        System.out.println("Bird is eating..");
    }
}

/*class Owl extends Bird {
    @Override
    public void eat() {
        System.out.println("Owl is eating..");
    }
}*/

interface AbleToDrink {
    void drink();
}

class Dogs implements AbleToDrink {
    @Override
    public void drink() {
        System.out.println("Drinking");
    }
}

public class AnonimClassExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();

        // анонимный класс, который наследуется от Bird с переопределенным методом eat()
        // Объект класса - наследника Bird
        Bird owl = new Bird() {
            @Override
            public void eat() {
                System.out.println("Owl is eating..");
            }
        };
        owl.eat();

        // анонимный класс, который реализует интерфейс AbleToDrink
        AbleToDrink cat = new AbleToDrink() {
            @Override
            public void drink() {
                System.out.println("Cat is drinking");
            }
        };
    }
}
