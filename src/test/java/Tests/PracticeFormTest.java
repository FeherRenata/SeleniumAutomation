package Tests;

import org.openqa.selenium.*;
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

        // Scroll in pagina
        js.executeScript("window.scrollBy(0, 500);");

        //identificarea elementelor la Gender-> radio button
        WebElement genderMaleElemet = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement genderFemaleElemet = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement genderOtherElemet = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderValue = "Female";

        if (genderMaleElemet.getText().equals(genderValue)) {
            genderMaleElemet.click();
        } else if (genderFemaleElemet.getText().equals(genderValue)) {
            genderFemaleElemet.click();
        } else if (genderOtherElemet.getText().equals(genderValue)) {
            genderOtherElemet.click();
        }

        WebElement subjectElement = driver.findElement(By.id("subjectsInput"));
        String subjectsValue = "Social Studies";
        subjectElement.sendKeys(subjectsValue);
        subjectElement.sendKeys(Keys.ENTER);

        WebElement StateElement = driver.findElement(By.id("react-select-3-input"));
        js.executeScript("arguments[0].click()", StateElement);
        StateElement.sendKeys("NCR");
        StateElement.sendKeys(Keys.ENTER);

        WebElement CityElement = driver.findElement(By.id("react-select-4-input"));
        js.executeScript("arguments[0].click()", CityElement);
        CityElement.sendKeys("Delhi");
        CityElement.sendKeys(Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click()", submitElement);


    }
}
