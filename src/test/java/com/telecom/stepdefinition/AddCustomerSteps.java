package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerSteps {
	
	
	@Given("User navigates into add customer page")
	public void user_navigates_into_add_customer_page() throws InterruptedException {
		
		handleFrame();
		
		Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}
	
	public void handleFrame() throws InterruptedException {
		
	/*	 Thread.sleep(5000);
		    Hooks.driver.switchTo().frame("flow_close_btn_iframe");
		    Hooks.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		    Hooks.driver.switchTo().defaultContent();*/

	}

	@When("User enters all the feilds")
	public void user_enters_all_the_feilds() throws InterruptedException {
		
		handleFrame();
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys("karthi");
		Hooks.driver.findElement(By.id("lname")).sendKeys("rajan");
		Hooks.driver.findElement(By.id("email")).sendKeys("krajan@gmail.com");
		Hooks.driver.findElement(By.name("addr")).sendKeys("Thanjavur");
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys("1234556667");
	    
	}
	
	@When("User enters all the feilds by using 1dim list")
	public void user_enters_all_the_feilds_by_using_1dim_list(DataTable datas) throws InterruptedException {
	    
		List<String> cusDetails = datas.asList();
		
             handleFrame();
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0));
		Hooks.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1));
		Hooks.driver.findElement(By.id("email")).sendKeys(cusDetails.get(2));
		Hooks.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(4));
		
	}
	
	@When("User enters all the feilds by using 1dim map")
	public void user_enters_all_the_feilds_by_using_1dim_map(DataTable datas) throws InterruptedException {
	    
		Map<String, String> cusDetails = datas.asMap(String.class, String.class);
		
             handleFrame();
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(cusDetails.get("fname"));
		Hooks.driver.findElement(By.id("lname")).sendKeys(cusDetails.get("lname"));
		Hooks.driver.findElement(By.id("email")).sendKeys(cusDetails.get("mail"));
		Hooks.driver.findElement(By.name("addr")).sendKeys(cusDetails.get("add"));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get("phno"));
		
	}
	
	@When("User enters all the feilds by using 2dim list")
	public void user_enters_all_the_feilds_by_using_2dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<List<String>> cusDetails = dataTable.asLists();
		
		 handleFrame();
			
			Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(1).get(0));
			Hooks.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get(1));
			Hooks.driver.findElement(By.id("email")).sendKeys(cusDetails.get(1).get(2));
			Hooks.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get(3));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(1).get(4));
		
		
	}
	
	@When("User enters all the feilds by using 2dim map")
	public void user_enters_all_the_feilds_by_using_2dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String, String>> cusDetails = dataTable.asMaps();
		
		 handleFrame();
			
			Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(2).get("Fname"));
			Hooks.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get("Lname"));
			Hooks.driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get("Mail"));
			Hooks.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get("Address"));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(1).get("Phno"));
		
		
	}
	
	@When("User enters all the feilds {string},{string},{string},{string},{string}")
	public void user_enters_all_the_feilds(String fname, String lname, String mail, String address, String phno) throws InterruptedException {
		
		
		 handleFrame();
			
			Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(fname);
			Hooks.driver.findElement(By.id("lname")).sendKeys(lname);
			Hooks.driver.findElement(By.id("email")).sendKeys(mail);
			Hooks.driver.findElement(By.name("addr")).sendKeys(address);
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(phno);
		
	    
	}



	@When("User click on submit button")
	public void user_click_on_submit_button() {
		
		Hooks.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    
	}

	@Then("User should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() throws InterruptedException {
		
		handleFrame();
		
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}

}
