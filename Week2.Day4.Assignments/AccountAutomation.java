package week2.day4.assignments;

     import java.time.Duration;
     import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     import org.openqa.selenium.support.ui.Select;

public class AccountAutomation {

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

        // Step 6: Click on the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Step 7: Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Step 8: Click on Accounts tab
        driver.findElement(By.linkText("Accounts")).click();

        // Step 9: Click on Create Account button
        driver.findElement(By.linkText("Create Account")).click();

        // Step 10: Enter Account Name
        driver.findElement(By.id("accountName")).sendKeys("TestLeaf Automation");

        // Step 11: Enter Description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        // Step 12: Select Industry as ComputerSoftware
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
        Select industry = new Select(industryDropdown);
        industry.selectByVisibleText("ComputerSoftware");

        // Step 13: Select Ownership as S-Corporation
        WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(ownershipDropdown);
        ownership.selectByVisibleText("S-Corporation");

        // Step 14: Select Source as Employee (using value)
        WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
        Select source = new Select(sourceDropdown);
        source.selectByValue("LEAD_EMPLOYEE");

        // Step 15: Select Marketing Campaign as eCommerce Site Internal Campaign (using index)
        WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
        Select marketing = new Select(marketingDropdown);
        marketing.selectByIndex(6); // Adjust index if needed

        // Step 16: Select State/Province as Texas (using value)
        WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state = new Select(stateDropdown);
        state.selectByValue("TX");

        // Step 17: Click the Create Account button
        driver.findElement(By.className("smallSubmit")).click();

        // Step 18: Verify that the Account Name is displayed correctly
        String accountName = driver.findElement(By.xpath("//span[@id='viewAccount_accountName_sp']")).getText();
        if (accountName.contains("TestLeaf Automation")) {
            System.out.println(" Account created successfully: " + accountName);
        } else {
            System.out.println(" Account creation failed. Displayed name: " + accountName);
        }

        // Step 19: Close the browser
        driver.quit();
    }
}

