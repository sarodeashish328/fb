package testngDemoPK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass1 {
	@Parameters({"URL"})
	@Test(dataProvider="getdata")
	public void methodA(String url) throws InterruptedException {
		System.out.println("methodA run Succesfully");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
	}
//		http://tutorialsninja.com/demo/
//	URL
	@Test(dataProvider="getdata")
	public void MethodB(String user,String pass) 
	{
		System.out.println(user+pass);
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data =new Object[1][2];
		data[0][0]="sarodeash28@gmail.com";
		data[0][1]="Ashish28";
		return data;
		
	}
	
	
}
