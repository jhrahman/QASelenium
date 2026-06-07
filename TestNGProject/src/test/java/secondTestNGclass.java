import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondTestNGclass {

    WebDriver driver;
    @BeforeTest
    public void prepare(){
        driver = new EdgeDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void OpenBrowser(){
        System.out.println("Opening Browser");


    }
    @Test
    public void search() throws InterruptedException{
        driver.get("https://jhrahman.github.io");
//        driver.findElement(By.name("q")).sendKeys("jahid");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        System.out.println("Searching the user");
        Thread.sleep(3000);

    }
    @Test
    public void saveLocations(){
        System.out.println("Payment location saved");
    }
}
