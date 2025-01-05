package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTableTest {

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

        //declaram un element
        WebElement Elementsfield = driver.findElement(By.xpath("//h5[text()='Elements']"));
        Elementsfield.click();

        WebElement WebTablesField = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        WebTablesField.click();

        WebElement AddButton = driver.findElement(By.id("addNewRecordButton"));
        AddButton.click();

        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "Ana";
        FirstNameField.sendKeys(firstNameValue);

        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Ionescu";
        LastNameField.sendKeys(lastNameValue);

        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String emailValue = "name@example.com";
        EmailField.sendKeys(emailValue);

        WebElement AgeField = driver.findElement(By.id("age"));
        String ageValue = "30";
        AgeField.sendKeys(ageValue);

        WebElement SalaryField = driver.findElement(By.id("salary"));
        String salaryValue = "10000000";
        SalaryField.sendKeys(salaryValue);

        WebElement DepartmentField = driver.findElement(By.id("department"));
        String departmentValue = "QA";
        DepartmentField.sendKeys(departmentValue);

        WebElement SubmitButton = driver.findElement(By.id("submit"));
        SubmitButton.click();

    }


}
