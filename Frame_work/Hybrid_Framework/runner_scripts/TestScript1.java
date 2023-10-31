package runner_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_scripts.Base_Test;
import pom_scripts.Pom1;

public class TestScript1 extends Base_Test {

	@Test(dataProvider = "testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.passUn(d1);
		p.passPwd(d2);
		Thread.sleep(3000);
		p.clickBtn();
		Assert.fail();
	}
	
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Santhosh","1234"},
	   { "Pradeep","1234"}
	 };
	}


}
