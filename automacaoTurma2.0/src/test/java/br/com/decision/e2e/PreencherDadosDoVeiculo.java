package br.com.decision.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PreencherDadosDoVeiculo {
	private ChromeDriver driver;

	public void setDriver(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void preencherFormulario(String marca,
			String performance, String data_fabricacao, String n_assentos,
			String combustivel, String preco, String licenca, String milhas) {

		WebElement txtMarca = driver.findElement(By.id("make"));
		WebElement txtPerformance = driver.findElement(By.id("engineperformance"));
		WebElement txtFabricacao = driver.findElement(By.id("dateofmanufacture"));
		WebElement txtAssentos = driver.findElement(By.id("numberofseats"));
		WebElement txtCombustivel = driver.findElement(By.id("fuel"));
		WebElement txtPreco = driver.findElement(By.id("listprice"));
		WebElement txtLicenca = driver.findElement(By.id("licenseplatenumber"));
		WebElement txtMilhas = driver.findElement(By.id("annualmileage"));
		
		txtMarca.clear();
        txtMarca.sendKeys(marca);
        
        txtPerformance.clear();
        txtPerformance.sendKeys(performance);
        
        txtFabricacao.clear();
        txtFabricacao.sendKeys(data_fabricacao);
        
        txtAssentos.clear();
        txtAssentos.sendKeys(n_assentos);
        
        txtCombustivel.clear();
        txtCombustivel.sendKeys(combustivel);
        
        txtPreco.clear();
        txtPreco.sendKeys(preco);
        
        txtLicenca.clear();
        txtLicenca.sendKeys(licenca);
        
        txtMilhas.clear();
        txtMilhas.sendKeys(milhas);
        
	}
	
	public ChromeDriver enviar_formulario() {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextenterinsurantdata")));
		
		WebElement href = driver.findElement(By.id("nextenterinsurantdata"));
		wait.until(ExpectedConditions.elementToBeClickable(href));
		href.click();

		return driver;
	}
	
}
