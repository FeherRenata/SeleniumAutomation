package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {
    public WebDriver driver;

    @Test
    public void automationMethod() {

        // deschidem un browser de Chrome
        driver = new EdgeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");

        // facem browser-ul in modul mazimize
        driver.manage().window().maximize();

        // facem un Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll un numar specific de pixels (e.g., 500 pixels)
        js.executeScript("window.scrollBy(0, 500);");

        WebElement formsElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsElement.click();

        WebElement practiceFormElement= driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormElement.click();

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameValue = "Andreea";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameValue = "Pop";
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String emailValue = "name@example.com";
        emailElement.sendKeys(emailValue);

        WebElement mobileNumberElement = driver.findElement(By.cssSelector("input[placeholder = 'Mobile Number']"));
        String mobileNumberValue = "0123456789";
        mobileNumberElement.sendKeys(mobileNumberValue);

        WebElement chooseFileButton = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/1.png");
       chooseFileButton.sendKeys(file.getAbsolutePath());




        //js.executeScript("window.scrollBy(0, 500);");




    }
}
