import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends BasePage{

    By goToCardbutton=By.xpath("//*[@class='goBasket']");
    By increaseQty= By.xpath("//*[@class='ty-numeric-counter-button']");
    By deleteButton=By.xpath("//*[@class='i-trash']");
    By getDeleteButtonPath=By.xpath("//*[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-primary']");
    By emptyCard=By.xpath("//*[@class='pb-empty-basket']/div/span");

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void cardPageOperation() throws Exception {
        click(goToCardbutton);
        System.out.println("Sepete Gidildi.");
        click(increaseQty);
        System.out.println("Ürün adet sayısı 1 attırıldı.");
        click(deleteButton);
        System.out.println("Ürün sepetten silindi. ");
        click(getDeleteButtonPath);
        System.out.println("Ürün silmek istediğinden emin misin? silindi.");
       String emptyProduct = driver.findElement(emptyCard).getText();
        Assert.assertEquals("Sepetteki ürünler silinemedi.",emptyProduct,"Sepetinde ürün bulunmamaktadır.");
    }
}
