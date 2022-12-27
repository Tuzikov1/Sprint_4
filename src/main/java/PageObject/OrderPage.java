package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;
    //Инпут"Имя"
    private By inputName=By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    //Инпут "Фамилия"
    private By inputSurname=By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    // Инпут "Адрес"
    private By inputAddress = By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    //Инпут "Телефон"
    private By inputPhone= By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    //Инпут "Метро"
    private By inputMetro= By.className("select-search__input");
    // Селектор для выбора нужной станции метро
    private By selectorMetro=By.className("select-search__select");
    // кнопка "Далее"
    private By buttonNext=By.xpath("//div[@class='Order_NextButton__1_rCA']/button");
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void writingPersonalData(String name, String surname,String address, String phone, String metro){
        driver.findElement(inputName).click();
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputSurname).click();
        driver.findElement(inputSurname).sendKeys(surname);
        driver.findElement(inputAddress).click();
        driver.findElement(inputAddress).sendKeys(address);
        driver.findElement(inputPhone).click();
        driver.findElement(inputPhone).sendKeys(phone);
        driver.findElement(inputMetro).click();
        driver.findElement(inputMetro).sendKeys(metro);
        driver.findElement(selectorMetro).click();
        driver.findElement(buttonNext).click();
    }
}
