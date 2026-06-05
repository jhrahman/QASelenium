package PACKAGE_NAME;

public class FindLinkText {
    WebDriver driver;
    @Test
    public void test3(){
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.quit();
    }
}
