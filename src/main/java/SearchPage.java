import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

    By searchInput= By.xpath("//*[@class='search-box']");
    By priceByDescProducts=new By.ByCssSelector("option[value='PRICE_BY_DESC']");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct() throws Exception {
        setValue(searchInput,"laptop");
        System.out.println("Ürün arama kısmına laptop girildi.");
        inputEnter(searchInput);
        System.out.println("Ürünü aramak için enter yapıldı.");
        click(priceByDescProducts);
        System.out.println("En yüksek fiyatlı ürünler listelendi.");

    }
}
