package Test;

import org.testng.annotations.Test;

import DDT.LoginPage;
import generic.BaseTest;
import generic.ReadExcel;

public class ValidLogin extends BaseTest {
	@Test
	void validLogin() {
	LoginPage lp  = new LoginPage(driver);
	ReadExcel excel = new ReadExcel();
	String Username = excel.getData();

	

	}

}
