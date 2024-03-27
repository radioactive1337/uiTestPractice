import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/documentation/");
        WebElement h1 = driver.findElement(By.xpath("//div[@class='td-content']/h1"));
        System.out.println(h1.getText());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}