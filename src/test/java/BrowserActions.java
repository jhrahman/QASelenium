import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserActions {

    WebDriver driver;
    @Test
    public void firstTest(){
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        navigation("https://jhrahman.github.io");
        maximize();
        fullscreen();
        quit();


    }
    public void navigation(String url){
        driver.navigate().to(url);
    }
    public void maximize() {
        driver.manage().window().maximize();
    }
    public void fullscreen(){
        driver.manage().window().fullscreen();
    }
    public void quit(){
        driver.quit();
    }

}
