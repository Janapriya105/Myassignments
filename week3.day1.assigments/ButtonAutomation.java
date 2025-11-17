package week3.day1.assignments;

     import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     import java.time.Duration;

public class ButtonAutomation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//span[text()='Click and Confirm title.']")).click();

        String title = driver.getTitle();
        if (title.toLowerCase().contains("dashboard")) {
            System.out.println("Title verified: " + title);
        } 
        
        else
        	
        {
            System.out.println("Title NOT matched! Current title: " + title);
        }

         driver.navigate().back();
         
        WebElement disabledButton = driver.findElement(By.xpath("//span[text()='Confirm if the button is disabled']/parent::button"));
        boolean isEnabled = disabledButton.isEnabled();
        System.out.println("Is 'Confirm if the button is disabled' enabled? : " + isEnabled);

        WebElement submitButton = driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
        int x = submitButton.getLocation().getX();
        int y = submitButton.getLocation().getY();
        System.out.println("Submit button position → X: " + x + ", Y: " + y);

        WebElement saveBtn = driver.findElement(By.xpath("//span[text()='Find the Save button color']/parent::button"));
        String bgColor = saveBtn.getCssValue("background-color");
        System.out.println("Save button background color → " + bgColor);

        WebElement sizeBtn = driver.findElement(By.xpath("//span[text()='Find the height and width of this button']/parent::button"));
        int height = sizeBtn.getSize().getHeight();
        int width = sizeBtn.getSize().getWidth();
        System.out.println("Button height: " + height + " | width: " + width);

        driver.close();
    }
}
