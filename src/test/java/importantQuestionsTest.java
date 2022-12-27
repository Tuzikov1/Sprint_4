import PageObject.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static Constants.MainPageAnswer.answer;


public class importantQuestionsTest extends TestBase {


    @Test
    public void Test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openBrowser();
        mainPage.closeCookie();
        String[] result = mainPage.importantAnswer();
        Assert.assertArrayEquals("Изменился текст ответа", answer, result);
    }
}



