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

        //Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");


        WebElement formsElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsElement.click();

        WebElement practiceFormElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
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

        // Scroll in pafina
        js.executeScript("window.scrollBy(0, 500);");

        //identificarea elementelor la Gender-> radio button
        WebElement genderMaleElemet = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement genderFemaleElemet = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement genderOtherElemet = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderValue = "Other";

        if (genderValue.equals("Male")) {
            genderMaleElemet.click();
        } else if (genderValue.equals("Female")) {
            genderFemaleElemet.click();
        } else if (genderValue.equals("Other")) {
            genderOtherElemet.click();
        }



    }
}
