import org.junit.jupiter.api.Test;

public class Test_Trendyol extends BaseTest{

    SearchPage searchPage=new SearchPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    ProductsPage productsPage=new ProductsPage(driver);
    ProductDetails productDetails=new ProductDetails(driver);
    CardPage cardPage=new CardPage(driver);


    @Test
    public void startTest() throws Exception {
        loginPage.getLoginPage();
        loginPage.setEmailAndPassword();
        searchPage.searchProduct();
        productsPage.randomSelectProduct();
        productDetails.addToCard();
        cardPage.cardPageOperation();
    }
}
