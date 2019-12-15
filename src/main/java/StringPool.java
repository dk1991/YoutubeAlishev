public class StringPool {
    public static void main(String[] args) {
        String a = "Hello!"; // создается Объект 1
        String b = "Hello!"; // новый объект не создается, b ссылается на объект 1

        System.out.println(a == b); // true
    }
}

