package week2.day4.assignments;

      import java.time.Duration;
      import org.openqa.selenium.By;
      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.WebElement;
      import org.openqa.selenium.chrome.ChromeDriver;
      import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 2: Load the URL
        driver.get("https://en-gb.facebook.com/");

        // Step 3: Maximize the browser window
        driver.manage().window().maximize();

        // Step 4: Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 5: Click on Create new account button
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        // Pause briefly for registration modal to appear
        Thread.sleep(2000);

        // Step 6: Enter First name
        driver.findElement(By.name("firstname")).sendKeys("Jana");

        // Step 7: Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Priya");

        // Step 8: Enter Mobile number or email address
        driver.findElement(By.name("reg_email__")).sendKeys("janapriya.test@gmail.com");

        // Step 9: Enter New password
        driver.findElement(By.id("password_step_input")).sendKeys("Test@1234");

        // Step 10: Handle dropdowns for Date of birth
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select day = new Select(dayDropdown);
        day.selectByVisibleText("13");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropdown);
        month.selectByVisibleText("Nov");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByVisibleText("1999");

        // Step 11: Select the Gender radio button (e.g., Female)
        driver.findElement(By.xpath("//label[text()='Female']")).click();

        // Optional: Wait a bit before closing to observe the result
        Thread.sleep(3000);

        // Step 12: Close the browser
        driver.quit();
    }
}

     