import org.openqa.selenium.JavascriptExecutor;


public class Steps extends BaseMethods {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void mainPageC() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://www.gittigidiyor.com/";

        if (mainPageUrl.equals(mainPageUrlC)) {
            System.out.println("Anasayfaya giriş başarılı.");
        } else {
            System.out.println("Anasayfaya giriş hatası.");
        }

    }


    public void goToLogin() throws InterruptedException {
        clickToElement(WebConstant.LoginButton);
        Thread.sleep(2000);
        clickToElement(WebConstant.LoginB);

    }


    public void login(){
        findElement(WebConstant.UserName).sendKeys("dgnsena98@gmail.com");
        findElement(WebConstant.Password).sendKeys("1234asdf");
        clickToElement(WebConstant.LoginButtonEnter);//GİRİŞ BUTONU
        String loginControl = findElement(WebConstant.nickName).getText();
        String loginControlW = "senadogan713853"; //username

        if (loginControl.equals(loginControlW)) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Hatalı giriş.");
        }

    }


    public void search(){
        findElement(WebConstant.Search).sendKeys("Bilgisayar");//kelime arama
        clickToElement(WebConstant.ButtonSearch);

    }


    public void secondPage() {
        jse.executeScript("window.scrollBy(0,9000)");
        clickToElement(WebConstant.SecondPage);

        String secondPageUrl = "https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2";//sayfa kontrol
        String secondPageC = getUrl();

        if(secondPageC.equals(secondPageUrl)){
            System.out.println("2. sayfadasınız.");
        }else{
            System.out.println("2. sayfada değilsiniz");
        }

    }


    public void addToBasket() throws InterruptedException {
        String price = findElement(WebConstant.ProductPrice).getText();
        clickToElement(WebConstant.ProductDetail);//buton

        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        clickToElement(WebConstant.addToBasketButton);

        Thread.sleep(2000);
        goToUrl("https://www.gittigidiyor.com/sepetim");
        String priceC = findElement(WebConstant.price2).getText();

        if (price.equals(priceC)) {
            System.out.println("Ürün fiyatları uyuşuyor."+ price);
        } else {
            System.out.println("Ürün fiyatlarını uyuşmuyor.");
        }

    }


    public void addToProduct() throws InterruptedException {
        clickToElement(WebConstant.ButtonAdd);
        Thread.sleep(2000);
        String amount = findElement(WebConstant.TotalAmount).getText();
        String amountC= "Toplam ürün miktarı(2 Adet)";


        if(amount.equals(amountC)){
            System.out.println("Sepetinizdeki " + amount);
        }else{
            System.out.println("Sepetteki ürün miktarı farklıdır");
        }

    }


    public void deleteProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickToElement(WebConstant.Delete);//button
        Thread.sleep(2000);
    }


    public void controlBasket() throws InterruptedException {
        String basket = "Sepette ürün bulunmamaktadır.";
        String basketC = findElement(WebConstant.ControlBasket).getText();
        Thread.sleep(2000);

        if (basket.equals(basketC)) {
            System.out.println("Sepetinizde ürün bulunmamaktadır.");
        } else {
            System.out.println("Sepetiniz ürün bulunmaktadır.");
        }

    }


    public void exit(){
        driver.quit();

    }


}
