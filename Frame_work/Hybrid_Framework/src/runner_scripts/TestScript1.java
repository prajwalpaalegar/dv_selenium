 package runner_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_scripts.Base_Test;
import pom_scripts.Pom1;

public class TestScript1 extends Base_Test {

	@Test(dataProvider = "testData")
	public void test1(String un,String pwd) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.passUn(un);
		p.passPwd(pwd);
		Thread.sleep(3000);
		p.clickBtn();
		Assert.fail();
	}

	@DataProvider(name = "testData")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric","admin"},
	   { "Anne","manager"},
	 };
	}


}
