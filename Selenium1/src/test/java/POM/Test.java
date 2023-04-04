package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		ActiTimeLoginPage atlp = new ActiTimeLoginPage(driver);
		atlp.getUsername().sendKeys("hjvhgfg");
		atlp.getPassword().sendKeys("jkbjhvj");
		atlp.getLoginBTN().click();
		Thread.sleep(4000);
		atlp.getUsername().sendKeys("admin");
		atlp.getPassword().sendKeys("manager");
		atlp.getLoginBTN().click();
		
	}

}
