package week3.day2.assignments;

public class MainClass {

	public static void main(String[] args) {

        
        TestData testData = new TestData();
        System.out.println("----Superclass Methods----");
        testData.enterCredentials();
        testData.navigateToHomePage();

        
        LogInTestData loginData = new LogInTestData();
        
        System.out.println("\n----Subclass Methods (Inherited + Own)----");
        loginData.enterCredentials();     
        loginData.navigateToHomePage();   
        loginData.enterUsername();        
        loginData.enterPassword();        
    }
}
