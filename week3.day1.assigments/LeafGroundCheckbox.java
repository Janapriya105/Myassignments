package week3.day1.assignments;

     import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckbox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        WebElement basicCheckbox = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div"));
        basicCheckbox.click();
        System.out.println("Basic Checkbox Selected: " + basicCheckbox.isSelected());

        WebElement notificationCheckbox = driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div"));
        notificationCheckbox.click();

        WebElement notificationMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
        System.out.println("Notification Message: " + notificationMsg.getText());

        WebElement javaLang = driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div"));
        javaLang.click();
        System.out.println("Java language selected: " + javaLang.isSelected());

        WebElement triState = driver.findElement(By.xpath("//div[@id='j_idt87:triState']"));
        triState.click();

        WebElement stateMsg = driver.findElement(By.xpath("//p[@id='j_idt87:messages']"));
        System.out.println("Tri-State: " + stateMsg.getText());

       WebElement toggleSwitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
        toggleSwitch.click();

        WebElement toggleMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
        System.out.println("Toggle Message: " + toggleMsg.getText());

        WebElement disabledCheckbox = driver.findElement(By.xpath("//input[@disabled='disabled']"));
        boolean disabled = !disabledCheckbox.isEnabled();
        System.out.println("Checkbox Disabled: " + disabled);

        driver.findElement(By.xpath("//ul[@data-label='Cities']/li[1]")).click(); // Rome
        driver.findElement(By.xpath("//ul[@data-label='Cities']/li[3]")).click(); // Paris
        driver.findElement(By.xpath("//ul[@data-label='Cities']/li[4]")).click(); // London
        
        System.out.println("Multiple selections completed.");

         Thread.sleep(3000);

        driver.quit();
    }
}

