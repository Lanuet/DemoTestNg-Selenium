import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nguye on 6/23/2017.
 */
public class Application {
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyTitle() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        try {
            Assert.assertEquals(expectedTitle, actualTitle);
            System.out.println("Test passed");
        } catch (Throwable b) {
            System.out.println("Test failure");
        }
    }

    @Test()
    public void verifyEmail() {
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    }
    @AfterClass
    public static void quitBrowser(){
        driver.close();
    }

}