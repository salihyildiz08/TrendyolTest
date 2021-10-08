import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage{



    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void click(By byElement) throws Exception{
        driver.findElement(byElement).click();
        waitBySecond(2);
    }

    public void setValue(By byElement,String text) throws Exception{
        WebElement element=driver.findElement(byElement);
        element.click();
        waitBySecond(2);
        element.sendKeys(text);
    }

    public void waitBySecond(Integer key) throws InterruptedException  {
        System.out.println("Burada "+key+" Saniye Beklendi");
        Thread.sleep(key*1000);
    }

    public void moveToElement(By byElement) throws InterruptedException{
        waitBySecond(2);
        WebElement element = this.driver.findElement(byElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        waitBySecond(2);
    }


    public void inputEnter(By byElement){
        WebElement element=driver.findElement(byElement);
        element.sendKeys(Keys.ENTER);
    }
}
