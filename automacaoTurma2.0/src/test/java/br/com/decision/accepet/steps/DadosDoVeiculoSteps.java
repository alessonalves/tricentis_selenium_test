package br.com.decision.accepet.steps;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.decision.e2e.PreencherDadosDoVeiculo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DadosDoVeiculoSteps {
	PreencherDadosDoVeiculo dados;
	static ChromeDriver driver;
	
	@BeforeClass
	public static void initilize() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
	}
	
	@Dado("O Menu dados do veiculo")
	public void a_o_menu_dados_do_veiculo() {
		driver.manage().window().maximize();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
		System.out.println("Dado 1");
		dados.setDriver(driver);
		dados = new PreencherDadosDoVeiculo();
		System.out.println("Dado 1-fim");
	}

	@Quando("Todos os dados do veiculo são preenchidos")
	public void todos_os_dados_do_veiculo_são_preenchidos() {
		dados.preencherFormulario("Ford", "1500", "09/22/2011", "5", "Diesel", "25000", "1754DFSD32", "20000");
	}
	@Entao("O menu Enter Insurant Data deve ser exibido")
	public void o_menu_deve_ser_exibido(String string) {
		dados.enviar_formulario();
		if (driver.findElement(By.id("idealsteps-nav")).findElements(By.tagName("li")).get(1).getText().equals("idealsteps-step-active")) {
			Assert.assertEquals("Enter Insurant Data","Enter Insurant Data");
		}
	}
}
