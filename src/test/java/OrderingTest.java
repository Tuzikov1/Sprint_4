import PageObject.MainPage;
import PageObject.OrderPage;
import PageObject.SecondOrderPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class OrderingTest extends TestBase {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String metro;
    private final String rent;
    private final String comment;

    public OrderingTest(String name, String surname, String address, String phone, String metro, String rent, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.metro = metro;
        this.rent = rent;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Дмитрий", "Варяг", "Улица Титова 4", "89639470523", "Выхино", "31.12.2022", "Все любят Пёсиков"},
                {"Петррррррр", "Мамун", "Улица Титова 23, квартира 55", "89639470666", "Павелецкая", "31.12.2023", "Все любят Котиков"},
        };
    }


 @Test
    public void registrationOrderUpButton() {

        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        SecondOrderPage secondOrderPage = new SecondOrderPage(driver);
        mainPage.openPageAndClickButtonUpOrder();
        orderPage.writingPersonalData(name, surname, address, phone, metro);
        secondOrderPage.writingRent(rent, comment);
        boolean result = secondOrderPage.isDisplayedOrder();
        Assert.assertTrue("Нет модального окна", result);
    }

 @Test
    public void registrationOrderBottomButton() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        SecondOrderPage secondOrderPage = new SecondOrderPage(driver);
        mainPage.openPageAndClickButtonBottomOrder();
        orderPage.writingPersonalData(name, surname, address, phone, metro);
        secondOrderPage.writingRent(rent, comment);
        boolean result = secondOrderPage.isDisplayedOrder();
        Assert.assertTrue("Нет модального окна", result);
    }
}




