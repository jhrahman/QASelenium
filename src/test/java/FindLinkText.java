import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FindLinkText {
    WebDriver driver;
    @Test
    public void test3(){
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/"); //navigate the site
        driver.findElement(By.linkText("Form Authentication")).click(); //find element by text link. Note that the text must be a link text
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.quit();
    }
}
