import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.util.List;


public class TagName {
    WebDriver driver;
    @Test
    public void test5() throws InterruptedException{
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click(); //single tag name
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRow = table.findElements(By.tagName("tr"));
        System.out.println(tableRow.size());
        Thread.sleep(3000);
        driver.quit();

    }
}
