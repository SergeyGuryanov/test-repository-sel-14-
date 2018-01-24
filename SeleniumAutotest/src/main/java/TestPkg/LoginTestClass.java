package TestPkg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestClass {
    static FirefoxDriver Driver;

    @BeforeClass
    public static void prepareToTest() {
        // Шаг 01: Запустить WEB-браузер.
        System.setProperty("webdriver.gecko.driver", "F:\\SeleniumDrivers\\geckodriver.exe");
        //System.setProperty("webdriver.chrome.driver", "d:\\TestReports\\Megaresheba\\chromedriver.exe");
        Driver = new FirefoxDriver();
        Driver.manage().window().maximize();

        // Шаг 02: В текущей вкладке запущенного браузера открыть URL: http://localhost/litecart/admin/
        Driver.get("http://localhost/litecart/admin/");
    }

    @Test
    public void loginTest(){
        // Шаг 03: На форме авторизации в поле "Username" ввести значение "admin".
        WebElement UserNameField = Driver.findElement(By.name("username"));
        UserNameField.clear();
        UserNameField.sendKeys("admin");

        // Шаг 04: На форме авторизации в поле "Password" ввести значение "admin".
        WebElement PasswordField = Driver.findElement(By.name("password"));
        PasswordField.clear();
        PasswordField.sendKeys("admin");

        // Шаг 05: Произвести клик по кнопке "Login".
        WebElement LoginButton = Driver.findElement(By.name("login"));
        LoginButton.click();
    }

    @AfterClass
    public static void finishTest(){
        // Шаг 06: Закрыть браузер.
        Driver.close();
    }
}
