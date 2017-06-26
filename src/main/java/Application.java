import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nguye on 6/23/2017.
 */
public class Application {
    public WebDriver driver;
    @Test
    public void verifyTitle() {
        System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        try {
            Assert.assertEquals(expectedTitle, actualTitle);
            System.out.println("Test passed");
        } catch (Throwable b) {
            System.out.println("Test failure");
        }
        driver.close();
    }

}