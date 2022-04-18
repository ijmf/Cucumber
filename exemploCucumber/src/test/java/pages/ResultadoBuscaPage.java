package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	WebDriver driver;
	
	final String PRODUTO_BUSCA = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div[2]/div[1]/h2/a/span"; 
	final String PRECO_PRODUTO = "/html/body/div[2]/div[2]/div[6]/div[4]/div[1]/div[3]/div/div/div/div/form/div/div/div/div/div[2]/div[1]/div/span/span[2]/span[2]"; 
	
	public ResultadoBuscaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clicarProduto() {
		
		driver.findElement(By.xpath(PRODUTO_BUSCA)).click();
		
	}
	
	public String retornarValorProduto() {
		
		return driver.findElement(By.xpath(PRECO_PRODUTO)).getText();
		
	}
}
