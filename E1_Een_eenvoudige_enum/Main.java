public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Status.values().length; i++) {
            Status status = Status.values()[i];
            status.run();
        }
    }
}
