package designPatterns.creational.singleton;

public enum Database {
    // It's compile time constant so acquiring the INSTANCE is thread safe,
    // also this approach will help us to solve reflection attack issue.
    INSTANCE;
    public void connect() {
        System.out.println("Connecting to the database...");
    }
    public void disconnect() {
        System.out.println("Disconnecting the database...");
    }
}
