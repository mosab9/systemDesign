package designPatterns.creational.singleton;

public class DataBaseConnector {

    // Lazy version
    // use getInstance() to create the object.
    private static DataBaseConnector INSTANCE;

    // eager version
    // no need for getInstance() in this case;
    //public static DataBaseConnector INSTANCE = new DataBaseConnector();

    // we are not able to instantiate the class
    private DataBaseConnector()
    {

    }
    public static DataBaseConnector getInstance()
    {
        // we just instantiate the class if necessary
        // IF WE HAVE MULTIPLE THREADS???
        if(INSTANCE == null) {
            // this block can be entered by a single thread
            // PROBLEM: it is too slow (100x)
            synchronized(DataBaseConnector.class) {
                INSTANCE = new DataBaseConnector();
            }
        }

        return INSTANCE;
    }

    public void connect()
    {
        System.out.println("Connecting to the database...");
    }

    public void disConnect()
    {
        System.out.println("Disconnecting ...");
    }
}
