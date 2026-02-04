package marathon1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        try {
            driver.findElement(By.xpath("//*[text() = 'Continue shopping']")).click();
        } catch (Exception e) {
            System.out.println("No popup found – continuing...");
        }

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String resultText = driver.findElement(
                By.xpath("//*[text()='\"Bags for boys\"']/preceding-sibling::span[2]")
        ).getText();

        System.out.println("Result Text: " + resultText);
        String[] split = resultText.split(" ");

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[contains(@class,'a-checkbox-fancy')])[6]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[text()='Brands']/following::span)[4]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[text()='Brands']/following::i)[5]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[text()='Featured'])[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[text()='Newest Arrivals'])[2]")).click();
        Thread.sleep(2000);

        WebElement brandElement = driver.findElement(
                By.xpath("(//*[contains(@class,'a-size-mini')]/span)[1]")
        );
        String brandName = brandElement.getText();
        System.out.println("Brand Name: " + brandName);

        WebElement discountElement = driver.findElement(
                By.xpath("(//*[contains(@class,'a-letter-space')]/following::span[contains(text(),'%')])[1]")
        );
        String discount = discountElement.getText();
        System.out.println("Discount: " + discount);

        driver.quit();
    }
}

