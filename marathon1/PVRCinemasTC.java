package marathon1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemasTC {

    public static void main(String[] args) throws InterruptedException {

         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.pvrcinemas.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.findElement(By.xpath("//*[text()='Cinema']")).click();

    Thread.sleep(3000);

         driver.findElement(By.xpath("(//*[text()='Select Cinema'])[2]")).click();
        
         driver.findElement(By.xpath("//*[text()='INOX National, Virugambakkam Chennai']")).click();

         driver.findElement(By.xpath("//*[text()='Today']")).click();

         driver.findElement(By.xpath("(//*[text()='MASK'])[6]")).click();

         driver.findElement(By.xpath("(//*[text()='07:30 PM'])")).click();

         driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();

         driver.findElement(By.xpath("(//*[text()='Accept'])")).click();

         driver.findElement(By.xpath("//*[@id='SL.SILVER|E:10']")).click();

         String grandPrice = driver.findElement(By.xpath("//*[@class='grand-prices']")).getText();
         
         System.out.println("Grand Total: " + grandPrice);

         driver.findElement(By.xpath("(//*[text()='Proceed'])")).click();

         driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')])[2]")).click();

         String title = driver.getTitle();
         System.out.println("Title of the page: " + title);

         driver.close();
    }
}

