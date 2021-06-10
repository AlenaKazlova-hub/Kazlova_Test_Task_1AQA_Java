package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    public static final String URL = "https://the-internet.herokuapp.com/";
    private WebDriver webDriver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(URL);
        homePage = new HomePage(webDriver);

    }

    @AfterClass
    public void shutdown() {
        webDriver.quit();
    }

}
