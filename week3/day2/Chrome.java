package week3.day2;

public class Chrome extends Browser {

    public void openIncognito() {
        System.out.println("Opened browser in incognito mode");
    }

    public void clearCache() {
        System.out.println("Cleared browser cache");
    }

    public static void main(String[] args) {

        Chrome browser1 = new Chrome();

        browser1.openIncognito();
        browser1.clearCache();

        browser1.openURL();
        browser1.closeBrowser();
        browser1.navigateBack();
    }
}

	
