import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    protected WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();

    }
    @After
    public void closeChrome() {
        driver.quit();
    }
}
