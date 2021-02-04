public class RubberDuck {

    private static int count = 0;
    private int id;

    public RubberDuck() {
       count++;
       id = count;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "id=" + id +
                '}';
    }
}
