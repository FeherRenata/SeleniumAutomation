package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SortableInteractions {
    public WebDriver driver;

    @Test
    public void automationMethod() {

        // deschidem un browser de Chrome
        driver = new EdgeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // facem browser-ul in modul mazimize
        driver.manage().window().maximize();

}
}
