import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By loginOrRegisterButton=By.xpath("//*[@class='link account-user']");
    By emailInput=By.id("login-email");
    By passwordInput=By.id("login-password-input");
    By loginButton=By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit']");
    String email="testsalihyildiz@gmail.com";
    String password="test.123";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void getLoginPage() throws Exception{
        moveToElement(loginOrRegisterButton);
    }
    public void setEmailAndPassword() throws Exception {
        setValue(emailInput,email);
        System.out.println("Email adresi girildi.");
        setValue(passwordInput,password);
        System.out.println("Şifre girildi.");
        click(loginButton);
        System.out.println("Giriş Buttonuna tıklanıldı.");
    }
}
