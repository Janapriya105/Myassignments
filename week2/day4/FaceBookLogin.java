package week2.day4;
      
       import org.openqa.selenium.By;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.chrome.ChromeDriver;

    public class FaceBookLogin {
       
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Step 1: Instantiate the Browser driver
        WebDriver driver = new ChromeDriver();
        
        // Step 2: Load the URL
        driver.get("https://www.facebook.com/");
        
        // Step 3: Maximize the browser window
        driver.manage().window().maximize();
        
        // Step 4: Enter the email id
        driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
        
        // Step 5: Enter the password
        driver.findElement(By.id("pass")).sendKeys("Tuna@321");
        
        // Step 6: Click on the Login button
        driver.findElement(By.name("login")).click();
        
        // Step 7: Click on the "Find your account and log in." link
        driver.findElement(By.linkText("Find your account and log in.")).click();
        
        // Step 8: Verify the title of the current web page
        String title = driver.getTitle();
        System.out.println("The title of the current page is: " + title);
        
        // Optional: Validate the title
        if (title.contains("Forgotten Password")) {
            System.out.println("Title verification PASSED ");
        } else {
            System.out.println("Title verification FAILED ");
        }
        
        // Step 9: Close the browser
        driver.quit();
 
        }
}
    