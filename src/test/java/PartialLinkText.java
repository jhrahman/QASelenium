import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class PartialLinkText {
    WebDriver driver;
    @Test
    public void test4() throws InterruptedException{
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("JavaScript onload")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
