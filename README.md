# Test Repository-sel-14
package TestPkg;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
    public static void main(String[] Args){


        System.setProperty("webdriver.gecko.driver", "F:\\SeleniumDrivers\\geckodriver.exe");
        //System.setProperty("webdriver.chrome.driver", "d:\\TestReports\\Megaresheba\\chromedriver.exe");

        FirefoxDriver Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
        Driver.get("http://google.ru");



        Driver.close();