package week3.day3.assignments;


 public class JavaConnectionMysql extends MySqlConnection {


 public void connect() {
     System.out.println("Connected to Java Database.");
 }

 @Override
 public void disconnect() {
     System.out.println("Disconnected from Java Database.");
 }

 @Override
 public void executeUpdate() {
     System.out.println("Executing update operation...");
 }

 @Override
 public void executeQuery() {
     System.out.println("Executing query operation...");
 }

 
 public static void main(String[] args) {
     JavaConnection conn = new JavaConnection();
     conn.connect();
     conn.executeUpdate();
     conn.disconnect();
 }
}

