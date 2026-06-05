import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class xpath {
    WebDriver driver;
    @Test
    public void test6() throws InterruptedException{
        driver = new EdgeDriver(new EdgeOptions().addArguments("--inprivate"));
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("jahid");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}
