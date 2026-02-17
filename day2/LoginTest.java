package week5.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        Object[][] data = new Object[3][2];
        
        data[0][0] = "admin";
        data[0][1] = "admin123";

        data[1][0] = "user1";
        data[1][1] = "password1";

        data[2][0] = "guest";
        data[2][1] = "guest123";

        return data;
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + " | Password: " + password);
        // Add your Selenium steps here
    }
}
