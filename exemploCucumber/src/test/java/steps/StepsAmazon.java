package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;

import org.junit.Assert;
import org.junit.Test; 
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ResultadoBuscaPage;


public class StepsAmazon {
	WebDriver driver;

	@Before
	public void before() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Dado("que esteja na pagina: {string}")
	  @Test
	public void que_esteja_na_pagina(String url) {
		driver.get(url);
		//throw new io.cucumber.java.PendingException();
	}

	@Quando("fizer a busca pelo produto: {string}")
	  @Test
	public void fizer_a_busca_pelo_produto(String produto) {
		
		HomePage homePage = new HomePage(driver);
	    homePage.realizaBusca(produto);
		
		//throw new io.cucumber.java.PendingException();
	}

	@Entao("vou verificar se o valor esta acima de {string}")
	  @Test
	public void vou_verificar_se_o_valor_esta_acima_de(String valorProduto) {
		ResultadoBuscaPage resultadoPage = new ResultadoBuscaPage(driver);
		resultadoPage.clicarProduto();
		Assert.assertEquals(valorProduto, resultadoPage.retornarValorProduto());
		
	}
}
