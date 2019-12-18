public class RecursionExample {
    public static void main(String[] args) {
        counter(3);
        System.out.println("End");

        // 4! = 4 * 3 * 2 * 1;
        System.out.println(factorial(4));
    }

    // counter(3) -> counter(2) -> counter(1) -> counter(0)
    /*
        counter(3)
        counter(2)
        counter(1)
        counter(0)
     */
    private static void counter(int n) {
        if (n == 0) { // Base case (условие выхода)
            return;
        }
        System.out.println(n);

        counter(n - 1); // 3, 2, 1
    }

    // factorial(4)
    // 4 * factorial(3)
    // 3 * factorial(2)
    // 2 * factorial(1)
    // factorial(1) return 1;
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
