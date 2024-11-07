package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepsDefination {
	WebDriver driver;
	@Before
	public void setup()
	{
	System.out.println("inside before hook");	
	}
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();	
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
		driver=new EdgeDriver();	
		}
		if(browserName.equalsIgnoreCase("mozilla"))
		{
		driver=new FirefoxDriver();	
		}
	}

	@Given("user launch app url using {string}")
	public void user_launch_app_url_using(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	
	}

	@When("user clicks on login button using xpath {string}")
	public void user_clicks_on_login_button_using_xpath(String xpath) {
	 driver.findElement(By.xpath(xpath)).click();
	}

	@Then("user verifies the title to be {string}")
	public void user_verifies_the_title_to_be(String exptitle) {
	Assert.assertEquals(exptitle, driver.getTitle());	
	}
	@After
	public void teardown()
	{
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	driver.quit();
	}
	@When("user clicks link using xpath {string}")
	public void user_clicks_link_using_xpath(String xpath) {
	driver.findElement(By.xpath(xpath)).click();
	}
	@When("user enters details in registration form")
	public void user_enters_details_in_registration_form(DataTable dataTable) {
		List<List<String>> alldatalist=dataTable.asLists();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(alldatalist.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(alldatalist.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(alldatalist.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(alldatalist.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(alldatalist.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(alldatalist.get(0).get(5));
	}
	@When("user enters details in registration form2")
	public void user_enters_details_in_registration_form2(DataTable dataTable) {
		List<Map<String, String>> alldatamap=dataTable.asMaps();//4thone
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(alldatamap.get(0).get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(alldatamap.get(0).get("password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(alldatamap.get(0).get("re-enter password"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(alldatamap.get(0).get("fullname"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(alldatamap.get(0).get("mailid"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(alldatamap.get(0).get("captcha"));
	}
@AfterStep
public void screenshot()
{
System.out.println("screenshot is taken");	
}
}
