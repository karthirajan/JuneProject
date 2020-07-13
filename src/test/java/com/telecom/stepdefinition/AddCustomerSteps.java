package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	AddCustomerPage acp = new AddCustomerPage();
	
	@Given("User navigates into add customer page")
	public void user_navigates_into_add_customer_page() throws InterruptedException {
		
		handleFrame();
		
	    ca.button(acp.getCustomerBtn());
	    
	}
	
	public void handleFrame() throws InterruptedException {
		
	/*	 Thread.sleep(5000);
		    driver.switchTo().frame("flow_close_btn_iframe");
		    driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		    driver.switchTo().defaultContent();*/

	}

	@When("User enters all the feilds")
	public void user_enters_all_the_feilds() throws InterruptedException {
		
		handleFrame();
		
		ca.button(acp.getDoneBtn());
		ca.insertText(acp.getFirstName(), "karthi");
		ca.insertText(acp.getLastName(), "rajan");
		ca.insertText(acp.getMail(), "karthirajan@gmail.com");
		ca.insertText(acp.getAddress(), "chennai");
		ca.insertText(acp.getPhno(), "676254242562");
	    
	}
	
	@When("User enters all the feilds by using 1dim list")
	public void user_enters_all_the_feilds_by_using_1dim_list(DataTable datas) throws InterruptedException {
	    
		List<String> cusDetails = datas.asList();
		
             handleFrame();
             
             ca.button(acp.getDoneBtn());
     		ca.insertText(acp.getFirstName(), cusDetails.get(0));
     		ca.insertText(acp.getLastName(), cusDetails.get(1));
     		ca.insertText(acp.getMail(), cusDetails.get(2));
     		ca.insertText(acp.getAddress(), cusDetails.get(3));
     		ca.insertText(acp.getPhno(), cusDetails.get(4));
		
		
		
	}
	
	@When("User enters all the feilds by using 1dim map")
	public void user_enters_all_the_feilds_by_using_1dim_map(DataTable datas) throws InterruptedException {
	    
		Map<String, String> cusDetails = datas.asMap(String.class, String.class);
		
             handleFrame();
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDetails.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cusDetails.get("lname"));
		driver.findElement(By.id("email")).sendKeys(cusDetails.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(cusDetails.get("add"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get("phno"));
		
	}
	
	@When("User enters all the feilds by using 2dim list")
	public void user_enters_all_the_feilds_by_using_2dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<List<String>> cusDetails = dataTable.asLists();
		
		 handleFrame();
			
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(cusDetails.get(1).get(0));
			driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get(1));
			driver.findElement(By.id("email")).sendKeys(cusDetails.get(1).get(2));
			driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get(3));
			driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(1).get(4));
		
		
	}
	
	@When("User enters all the feilds by using 2dim map")
	public void user_enters_all_the_feilds_by_using_2dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String, String>> cusDetails = dataTable.asMaps();
		
		 handleFrame();
			
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(cusDetails.get(2).get("Fname"));
			driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get("Lname"));
			driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get("Mail"));
			driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get("Address"));
			driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(1).get("Phno"));
		
		
	}
	
	@When("User enters all the feilds {string},{string},{string},{string},{string}")
	public void user_enters_all_the_feilds(String fname, String lname, String mail, String address, String phno) throws InterruptedException {
		
		
		 handleFrame();
			
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(fname);
			driver.findElement(By.id("lname")).sendKeys(lname);
			driver.findElement(By.id("email")).sendKeys(mail);
			driver.findElement(By.name("addr")).sendKeys(address);
			driver.findElement(By.id("telephoneno")).sendKeys(phno);
		
	    
	}



	@When("User click on submit button")
	public void user_click_on_submit_button() {
		
		ca.button(acp.getSubmitBtn());
	    
	}

	@Then("User should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() throws InterruptedException {
		
		handleFrame();
		
		Assert.assertTrue(acp.getSuccessMessage().isDisplayed());
	    
	}

}
