import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest{

    protected static WebDriver driver;
    static String baseUrl="https://www.trendyol.com/butik/liste/1/kadin";


    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Assert.assertEquals("Anasayfa açılırken bir hata oluştu !!",baseUrl,driver.getCurrentUrl());
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }






}