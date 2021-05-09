import org.junit.Test;

public class Cases extends Steps {
    @Test
    public void adToBasketTest() throws InterruptedException {
        mainPageC();
        goToLogin();
        login();
        search();
        secondPage();
        addToBasket();
        addToProduct();
        deleteProduct();
        controlBasket();
        exit();

    }
}
