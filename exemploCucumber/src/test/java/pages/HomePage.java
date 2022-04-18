package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.HomePage;




public class HomePage {

	WebDriver driver;
	
	final String CAMPO_BUSCA = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div[1]/input"; 
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void realizaBusca(String produto) {
		
		driver.findElement(By.xpath(CAMPO_BUSCA)).sendKeys(produto);
		driver.findElement(By.xpath(CAMPO_BUSCA)).sendKeys(Keys.ENTER);
	}
}
