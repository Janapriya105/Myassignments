package week2.day4.assignments;

      import java.time.Duration;
      import org.openqa.selenium.By;
      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.chrome.ChromeDriver;

public class LeadAutomation {

    public static void main(String[] args) {

        // Step 1: Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 2: Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Step 3: Maximize the browser window
        driver.manage().window().maximize();

        // Step 4: Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 5: Enter Username and Password
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Step 6: Click the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Step 7: Click on the CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Step 8: Click on the Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Step 9: Click on the Create Lead button
        driver.findElement(By.linkText("Create Lead")).click();

        // Step 10: Enter FirstName, LastName, CompanyName, and Title
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jana");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Engineer");

        // Step 11: Click the Create Lead button
        driver.findElement(By.name("submitButton")).click();

        // Step 12: Verify that the Title is displayed correctly
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("View Lead")) {
            System.out.println(" Lead created successfully — Title verified: " + pageTitle);
        } else {
            System.out.println(" Title verification failed. Current Title: " + pageTitle);
        }

        // Step 13: Close the browser
        driver.quit();
    }
}
