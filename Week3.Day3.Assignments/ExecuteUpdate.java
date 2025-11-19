package week3.day3.assignments;

public class ExecuteUpdate {

	 public static void main(String[] args) {

	        DatabaseConnection db = new  JavaConnection();

	        db.connect();
	        db.executeUpdate();
	        db.disconnect();
	    }
	}