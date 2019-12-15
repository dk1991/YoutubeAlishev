class Electrocar {
    private int id;
    public Electrocar(int id) {
        this.id = id;
    }

    // Вложенный нестатический класс, имеет доступ к полям и методам внешнего класса
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting");
        }
    }

    // Статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging..");
            //System.out.println(id); // нет доступа к НЕСТАТИЧЕСКИМ полям внешнего класса
        }
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Car " + id + " is starting");
        final int X = 0;

        // Вложенный класс внутри метода
        class InnerClass {
            public void innerMethod() {
                System.out.println(id + " " + X);
            }
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Electrocar car = new Electrocar(3);
        car.start();
        Electrocar.Battery battery = new Electrocar.Battery(); // создаем объект статического вложенного класса
    }
}
