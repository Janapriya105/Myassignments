package week2.day1;

//Browser.java
public class Browser {

 // Method to launch browser
 public String launchBrowser(String browserName) {
     System.out.println("Browser launched successfully");
     return browserName;
 }

 // Method to load URL
 public void loadUrl() {
     System.out.println("Application url loaded successfully");
 }

 // Main method to test Browser class methods
 public static void main(String[] args) {
     // Create object of Browser class
     Browser browser = new Browser();

     // Call the launchBrowser method
     String browserName = browser.launchBrowser("Chrome");
     System.out.println("Launched Browser: " + browserName);

     // Call the loadUrl method
     browser.loadUrl();
 }
}
