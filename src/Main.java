public class Main {
    public static void main(String[] args) {

        // Polymorphism example (Task 2 requirement)
        Servicable s1 = new Car("Toyota", 2020, 12000, 4);
        Servicable s2 = new Bus("Mercedes", 2018, 30000, 40);

        s1.performService();
        s2.performService();
    }
}
