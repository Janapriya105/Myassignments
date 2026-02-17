package week5.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLeadParameterization {

    ChromeDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite Executed here");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest Executed here");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass Executed here");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
    }

    // ---------------------- DATA PROVIDER ------------------------
    @DataProvider(name = "updateComData")
    public Object[][] updateComData() {

        Object[][] upData = new Object[2][2];

        // Test case 1
        upData[0][0] = "978979";   // phone number
        upData[0][1] = "Qeaglee";  // company name update

        // Test case 2
        upData[1][0] = "99941";   // phone number
        upData[1][1] = "CTSS";    // company name update

        return upData;
    }

    // ---------------------- MAIN TEST ---------------------------
    @Test(dataProvider = "updateComData")
    public void runEditLead(String phnum, String updateComName) throws InterruptedException {

        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        Thread.sleep(2000);

        // Click the first resulting lead
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

        driver.findElement(By.linkText("Edit")).click();

        WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
        companyName.clear();
        companyName.sendKeys(updateComName);

        driver.findElement(By.name("submitButton")).click();

        // Verify
        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();

        if (text.contains(updateComName)) {
            System.out.println("Lead is edited successfully");
        } else {
            System.out.println("Lead is not edited");
        }
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass Executed here");
        driver.quit();
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest Executed here");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite Executed here");
    }
}

