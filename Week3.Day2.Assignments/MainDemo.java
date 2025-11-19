package week3.day2.assignments;

public class MainDemo {

	
	    public static void main(String[] args) {

	        // Object of SuperClass
	        SuperClass superObj = new SuperClass();
	        superObj.displayMessage();  // Calls SuperClass version

	        // Object of SubClass
	        SubClass subObj = new SubClass();
	        subObj.displayMessage();    // Calls overridden version

	        // Polymorphism: SuperClass reference → SubClass object
	        SuperClass polyObj = new SubClass();
	        polyObj.displayMessage();   // Calls SubClass overridden method
	    }
	}

