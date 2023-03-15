import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    WebDriver driver = new ChromeDriver();
    String url = "https://www.saucedemo.com";
    By userName = By.xpath("//*[@id=\"user-name\"]");
    By password = By.id("password");
    By loginButton = By.xpath("//*[@id=\"login-button\"]");
    By addToCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By shoppingCartContainer = By.cssSelector("#shopping_cart_container > a");
    By checkoutButton = By.id("checkout");
    By firstName = By.xpath("//*[@id=\"first-name\"]");
    By lastName = By.xpath("//*[@id=\"last-name\"]");
    By postalCode = By.xpath("//*[@id=\"postal-code\"]");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    @Test
    public void firstTest() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
        driver.findElement(addToCart).click();
        driver.findElement(shoppingCartContainer).click();
        driver.findElement(checkoutButton).click();
        driver.findElement(firstName).sendKeys("test");
        driver.findElement(lastName).sendKeys("test");
        driver.findElement(postalCode).sendKeys("test");
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
        driver.quit();
    }
    @Test
    public void secondTest() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(userName).sendKeys("test");
        driver.findElement(password).sendKeys("test");
        driver.findElement(loginButton).click();
        driver.quit();
    }
}
