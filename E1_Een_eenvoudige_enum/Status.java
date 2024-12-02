public enum Status {
    STARTED, PAUSED, STOPPED, UNREACHABLE;

    void run() {
        System.out.println(name());
    }
}
