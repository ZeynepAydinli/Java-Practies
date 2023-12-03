public class Main {
    public static void main(String[] args) {

        Screen screen1 = new Screen(new Account("zeynep", "1234", 5000.0));
        Screen screen2 = new Screen(new Account("burak", "6789", 5000.0));
        screen1.run();
    }
}
