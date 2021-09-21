package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPathEvaluationResult;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TesteWeb {
    ChromeDriver driver;
    @Before
    public void StartDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @Test
     public void primeiroTeste() {
        //Aba “Enter Vehicle Data”
        WebElement selectElementMake = driver.findElement(By.id("make"));
        Select selectObject1 = new Select(selectElementMake);
        selectObject1.selectByVisibleText("Nissan");
        WebElement selectElementModel = driver.findElement(By.id("model"));
        Select selectObject2 = new Select(selectElementModel);
        selectObject2.selectByVisibleText("Scooter");
        driver.findElement(By.id("entervehicledata")).click();
        driver.findElement(By.id("cylindercapacity")).sendKeys("100");
        driver.findElement(By.id("engineperformance")).sendKeys("100");
        driver.findElement(By.id("dateofmanufacture")).sendKeys("01/01/2021");
        WebElement selectElementSeats = driver.findElement(By.id("numberofseats"));
        Select selectObject3 = new Select(selectElementSeats);
        selectObject3.selectByVisibleText("3");
        driver.findElement(By.xpath("//div[7]/p/label[1]//span")).click();
        if (!driver.findElement(By.xpath("//div[7]/p/label[1]//span")).isSelected()) {
            driver.findElement(By.xpath("//div[7]/p/label[1]//span")).click();
        }
        WebElement selectElementNumMot = driver.findElement(By.id("numberofseatsmotorcycle"));
        Select selectObject4 = new Select(selectElementNumMot);
        selectObject4.selectByVisibleText("3");
        WebElement selectElementFuel = driver.findElement(By.id("fuel"));
        Select selectObject5 = new Select(selectElementFuel);
        selectObject5.selectByVisibleText("Diesel");
        driver.findElement(By.id("payload")).sendKeys("100");
        driver.findElement(By.id("totalweight")).sendKeys("100");
        driver.findElement(By.id("listprice")).sendKeys("1000");
        driver.findElement(By.id("licenseplatenumber")).sendKeys("100");
        driver.findElement(By.id("annualmileage")).sendKeys("100");
        driver.findElement(By.id("nextenterinsurantdata")).click();

        //Aba “Enter Vehicle Data"
        driver.findElement(By.id("firstname")).sendKeys("firstname");
        driver.findElement(By.id("lastname")).sendKeys("lastname");
        driver.findElement(By.id("birthdate")).sendKeys("01/01/1990");
        driver.findElement(By.id("streetaddress")).sendKeys("12 Street");
        driver.findElement(By.xpath("//div[4]/p/label[1]/span")).click();
        if (!driver.findElement(By.xpath("//div[4]/p/label[1]/span")).isSelected()) {
            driver.findElement(By.xpath("//div[4]/p/label[1]/span")).click();
        }
        WebElement selectElementCountry = driver.findElement(By.id("country"));
        Select selectObject6 = new Select(selectElementCountry);
        selectObject6.selectByVisibleText("Brazil");
        driver.findElement(By.id("zipcode")).sendKeys("69000100");
        driver.findElement(By.id("city")).sendKeys("Manaus");
        WebElement selectElementOccupation = driver.findElement(By.id("occupation"));
        Select selectObject7 = new Select(selectElementOccupation);
        selectObject7.selectByVisibleText("Farmer");
        WebElement checkbox = driver.findElement(By.xpath("//div[10]/p/label[2]/span"));
        checkbox.click();
        driver.findElement(By.id("website")).sendKeys("www.google.com");
        driver.findElement(By.id("nextenterproductdata")).click();

        //Aba "Enter Product Data"
        driver.findElement(By.id("startdate")).sendKeys("01/01/2025");
        Select oSelect = new Select(driver.findElement(By.id("insurancesum")));
        oSelect.selectByValue("7000000");
        WebElement selectElementMeritrating = driver.findElement(By.id("meritrating"));
        Select selectObject8 = new Select(selectElementMeritrating);
        selectObject8.selectByVisibleText("Bonus 5");
        WebElement selectElementDamageinsurance = driver.findElement(By.id("damageinsurance"));
        Select selectObject9 = new Select(selectElementDamageinsurance);
        selectObject9.selectByVisibleText("No Coverage");
        WebElement checkbox1 = driver.findElement(By.xpath("//div[5]/p/label[1]/span"));
        checkbox1.click();
        WebElement selectElementCourtesycar = driver.findElement(By.id("courtesycar"));
        Select selectObject10 = new Select(selectElementCourtesycar);
        selectObject10.selectByVisibleText("No");
        driver.findElement(By.id("nextselectpriceoption")).click();

        //Aba "Price Option"
        driver.findElement(By.xpath("//th[2]/label[2]/span")).click();
        WebElement nextBtn = driver.findElement(By.id("nextsendquote"));
        Actions actionProvider = new Actions(driver);
        actionProvider.doubleClick(nextBtn).build().perform();

        //Aba Send Quote
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("phone")).sendKeys("123456789");
        driver.findElement(By.id("username")).sendKeys("NameTest");
        driver.findElement(By.id("password")).sendKeys("Test123");
        driver.findElement(By.id("confirmpassword")).sendKeys("Test123");
        driver.findElement(By.id("Comments")).sendKeys("test");
        driver.findElement(By.id("sendemail")).click();
    }

    @After
    public void finishDriver() {
        driver.quit();
    }

    //        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);

}




