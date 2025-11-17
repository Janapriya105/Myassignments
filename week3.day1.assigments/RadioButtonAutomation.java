package week3.day1.assignments;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.chrome.ChromeDriver;
   import java.time.Duration;

public class RadioButtonAutomation {

   public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.leafground.com/radio.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement favBrowser = driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div"));
        favBrowser.click();

        WebElement unselectableRadio = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[5]"));

        unselectableRadio.click();
        unselectableRadio.click();

boolean isSelected = unselectableRadio.findElement(By.className("ui-radiobutton-box")).getDomAttribute("class").contains("ui-state-active");

        System.out.println("Radio button selected after second click? --> " + isSelected);

         WebElement defaultSelected = driver.findElement(By.xpath("//input[@checked='checked']/following-sibling::div"));
        System.out.println("Default selected button is displayed: " + defaultSelected.isDisplayed());

        WebElement ageGroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div"));

        if (!ageGroup.findElement(By.className("ui-radiobutton-box"))
                .getDomAttribute("class").contains("ui-state-active")) {

            ageGroup.click();
            System.out.println("Age group 21–40 was not selected. Now selected.");
        } 
        else 
        {
            System.out.println("Age group 21–40 is already selected.");
        }

         driver.quit();
    }
}
