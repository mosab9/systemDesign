package designPatterns.creational.singleton;

public class App {
    public static void main(String[] args) {
        DataBaseConnector o1 = DataBaseConnector.getInstance();
        DataBaseConnector o2 = DataBaseConnector.getInstance();

        Database e1 = Database.INSTANCE;
        Database e2 = Database.INSTANCE;

        if(o1==o2)
            System.out.println("The objects are the same...");

        // check using enum
        if(e1==e2)
            System.out.println("The enum objects are the same...");

    }
}
