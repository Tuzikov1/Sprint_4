package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondOrderPage {
    private final WebDriver driver;
    // Ипут для выбора даты доставки
    private By inputDeliveryDate=By.xpath("//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']");
    // Кнопка для вызова dropdown-меню выбора срока аренды
    private By dropdownArrow= By.className("Dropdown-arrow");
    //Выбор срока аренды в dropdown-меню
    private By dropdownMenu= By.className("Dropdown-option");
    //Чек-бокс для  выбора цвета самоката
    private By boxColorScooter=By.className("Checkbox_Input__14A2w");
    // Инпут для Комментария
    private By inputComment= By.xpath("//div[@class='Input_InputContainer__3NykH']/input[@placeholder='Комментарий для курьера']");
    // Кнопка "Заказать"
    private By buttonOrder = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка "Да" для оформления заказа
    private By buttonYes= By.xpath("//div[@class='Order_Modal__YZ-d3']/div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка в модальном окне с оформленным заказом для просмотра статуса заказа
    private By modalOrder=By.className("Order_NextButton__1_rCA");



    public SecondOrderPage(WebDriver driver) {
        this.driver = driver;
    }
   public void writingRent(String rent, String comment){
        driver.findElement(inputDeliveryDate).click();
        driver.findElement(inputDeliveryDate).sendKeys(rent);
        driver.findElement(dropdownArrow).click();
        driver.findElement(dropdownMenu).click();
        driver.findElement(boxColorScooter).click();
       driver.findElement(inputComment).click();
       driver.findElement(inputComment).sendKeys(comment);
       driver.findElement(buttonOrder).click();
       driver.findElement(buttonYes).click();

   }
   public boolean isDisplayedOrder() {
      return driver.findElement(modalOrder).isDisplayed();
   }






}
