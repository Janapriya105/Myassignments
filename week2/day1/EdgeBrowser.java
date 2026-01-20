package week2.day1;

//EdgeBrowser.java
public class EdgeBrowser {
 public static void main(String[] args) {
     // Create an object of Browser class
     Browser browser = new Browser();

     // Call both methods from Browser class
     String browserName = browser.launchBrowser("Edge");
     System.out.println("Launched Browser: " + browserName);

     browser.loadUrl();
 }
}

