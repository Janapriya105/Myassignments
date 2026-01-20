package week3.day3.assignments;

public class JavaConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connecting to the Java Database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from the Java Database...");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Executing update query on Java Database...");
    }
}

	
