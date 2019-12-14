public class Animals {
    private int id;

    public Animals() {}

    public Animals(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                '}';
    }
}
