package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class MainPage {
    private final WebDriver driver;
    // Кнопка "Заказать" внизу страницы
   private By buttonBottomOrder=By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");
    //Кнопка "Заказать" вверху страницы
    private By buttonUpOrder = By.className("Button_Button__ra12g");
    //Кнопка использования аккордиона для поиска элементов List<>
    private By accordionButtonImportantQuestions = By.className("accordion__item");

    // Локатор, который позволяет вытащить текст из открывщегося аккордиона
    private By textAnswer= By.xpath(".//div[@class='accordion__panel']/p");
    // Закрытие куки
    private By buttonCookie = By.className("App_CookieButton__3cvqF");
    public MainPage(WebDriver driver){

        this.driver=driver;
    }
    public void openBrowser(){driver.get("https://qa-scooter.praktikum-services.ru/");}

    public void openPageAndClickButtonBottomOrder(){
        openBrowser();
        closeCookie();
        driver.findElement(buttonBottomOrder).click();
    }
    public void openPageAndClickButtonUpOrder(){
        openBrowser();
        driver.findElement(buttonUpOrder).click();
    }
    public void closeCookie(){
        driver.findElement(buttonCookie).click();
    }
    public String [] importantAnswer(){
            String [] arr = new String[8];
            List<WebElement> importantQuestions = driver.findElements(accordionButtonImportantQuestions);
            List<WebElement> importantAnswer = driver.findElements(textAnswer);
            for (int i=0;i<8;i++) {
                importantQuestions.get(i).click();
                new WebDriverWait(driver, Duration.ofSeconds(3))
                        .until(ExpectedConditions.visibilityOf(importantAnswer.get(i)));
                arr[i]=importantAnswer.get(i).getText();
            }
           return arr;
       }
}











