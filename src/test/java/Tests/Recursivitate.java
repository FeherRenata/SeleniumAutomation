package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Recursivitate {
    public WebDriver driver;

    @Test
    public void parcurgereListe() {

        // deschidem un browser de Chrome
        driver = new EdgeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/sortable");

        // facem browser-ul in modul mazimize
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        //Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

        List<WebElement> ListElements = driver.findElements(By.xpath("//div[@id = 'demo-tabpane-list']//div[@class='list-group-item list-group-item-action']"));
        for (int i = 0; i < ListElements.size() - 1; i++) {
            WebElement webElement = ListElements.get(i);
            WebElement urmatorulWebElement = ListElements.get(i + 1);
            System.out.println("Numarul elementului este: " + webElement.getText());
            actions.clickAndHold(webElement)
                    .moveToElement(urmatorulWebElement)
                    .release()
                    .build()
                    .perform();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
