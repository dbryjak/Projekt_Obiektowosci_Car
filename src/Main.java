public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car(4, 5, 4, "blue");
        Car auto2 = new Car(4, 5, 6, "red");
        Car auto3 = new Car("black");

        auto1.writeAll();
        auto3.writeAll();

    }
}