import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class ProductsPage extends BasePage{



    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void randomSelectProduct(){
        Random random = new Random();
        int randomProduct = random.nextInt(24) + 1;
        WebElement selectProduct=driver.findElement(By.xpath("//div[@class='prdct-cntnr-wrppr']/div["+randomProduct+"]"));
        selectProduct.click();
        System.out.println("Random 1 ürün seçildi ve tıklanıldı.");
    }

}
