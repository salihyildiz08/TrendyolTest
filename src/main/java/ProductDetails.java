import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetails extends BasePage{

    By addToBasket= By.xpath("//button[@class='add-to-basket']/div[@class='add-to-basket-button-text']");

    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    public void addToCard() throws Exception {
       click(addToBasket);
        System.out.println("Ürün Sepete Eklenildi");
    }


}
