import org.openqa.selenium.By;

public class WebConstant {
    public static By LoginButton = By.xpath("//div[@class='gekhq4-4 hwMdSM']");
    public static By LoginB = By.cssSelector("[data-cy='header-login-button']");
    public static By UserName = By.id("L-UserNameField");
    public static By Password = By.id("L-PasswordField");
    public static By LoginButtonEnter = By.id("gg-login-enter");
    public static By nickName = By.xpath("//*[@id=\"L-UserNameField\"]");
    public static By Search = By.xpath("//*[@id='search_word']");
    public static By ButtonSearch = By.cssSelector(".qjixn8-0.sc-1bydi5r-0.hKfdXF");
    public static By SecondPage = By.cssSelector("#best-match-right > div.pager.pt30.hidden-m.gg-d-24 > ul > li:nth-child(2) > a");//2.SAYFA BUTONU
    public static By ProductPrice= By.cssSelector("p[class='fiyat price-txt robotobold price']");
    public static By ProductDetail = By.cssSelector("[class='catalog-view clearfix products-container']>:nth-child(1)");//DETAY BUTONU
    public static By addToBasketButton = By.cssSelector("[id='purchaseSoldInfoActionButtons'] [id='add-to-basket']");
    public static By price2 = By.cssSelector("div[class='total-price']");
    public static By ButtonAdd = By.cssSelector("option[value='2']");
    public static By TotalAmount = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-child(1)");
    public static By Delete = By.cssSelector("a[title='Sil']");//delete button
    public static By ControlBasket = By.cssSelector("div[class='gg-w-22 gg-d-22 gg-18t-21 gg-m-']>:nth-child(1)");
}
