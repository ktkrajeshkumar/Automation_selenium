package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base_Class.Base_Class;


public class Login_Page extends Base_Class{

	//Create account Page Elements
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	WebElement signin;

	@FindBy(id="email_create")
	WebElement email;

	@FindBy(id="SubmitCreate")
	WebElement createbtn;

	@FindBy(id="id_gender1")
	WebElement mr_btn;

	@FindBy(id="customer_firstname")
	WebElement f_name;

	@FindBy(id="customer_lastname")
	WebElement l_name;

	@FindBy(id="email")
	WebElement email1;

	@FindBy(id="passwd")
	WebElement password;

	@FindBy(id="days")
	WebElement day;

	@FindBy(id="months")
	WebElement month;

	@FindBy(id="years")
	WebElement year;

	@FindBy(id="newsletter")
	WebElement checkbox1;

	@FindBy(id="optin")
	WebElement checkbox2;

	/*@FindBy(id="firstname")
	WebElement f_name_address;*/

	@FindBy(id="lastname")
	WebElement l_name_address;

	@FindBy(id="company")
	WebElement company;

	@FindBy(id="address1")
	WebElement add1;

	@FindBy(id="city")
	WebElement city;

	@FindBy(id="id_state")
	WebElement state;

	@FindBy(id="postcode")
	WebElement zipcode;


	@FindBy(id="other")
	WebElement other_box;

	@FindBy(id="phone_mobile")
	WebElement mobile_num;

	@FindBy(id="submitAccount")
	WebElement submit_Account;


	/*	//login page Elements
	@FindBy(id="email")
	WebElement l_email;

	@FindBy(id="passwd")
	WebElement l_password;*/


	@FindBy(id="SubmitLogin")
	WebElement login;

	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?mylogout=']")
	WebElement signout;


	//Initializing the Page Objects:
	public Login_Page(){
		PageFactory.initElements(driver, this);
	}

	//click on signin button 
	public void singin_btn() {
		signin.click();
	}

	//scroll Down to element visible
	public void moveto_element() {
		actions.moveToElement(createbtn);
		actions.perform();
	}

	//Enter email for account creation
	public void new_email(String em) {
		email.sendKeys(em);		
	}

	//Click on create button
	public void click_create(){
		createbtn.click();
	}

	//filling form
	//scroll Down to element visible
	public void moveto_lastname() {
		actions.moveToElement(l_name_address);
		actions.perform();
	}

	//select Mr radio btc
	public void mrbtn() {
		mr_btn.click();		
	}
	//enter first name
	public void first_name(String name) {
		f_name.sendKeys(name);
	}
	//enter last name
	public void last_name(String name) {
		l_name.sendKeys(name);
	}
	//password
	public void password(String pass) {
		password.sendKeys(pass);		
	}
	//select date
	public void date(String d) {
		Select date=new Select(day);
		date.selectByValue(d);
	}
	//select month
	public void month(String m) {
		Select mnt=new Select(month);
		mnt.selectByValue(m);
	}
	//select year
	public void year(String y) {
		Select date=new Select(year);
		date.selectByValue(y);
	}
	//check box1
	public void c_box1() {
		checkbox1.click();
	}
	//check box2
	public void c_box2() {
		checkbox2.click();
	}

	/*	//enter first name_add
	public void first_name_add(String name) {
		f_name_address.sendKeys(name);
	}
	//enter last name_add
	public void last_name_add(String name) {
		l_name_address.sendKeys(name);
	}*/

	//scroll Down to element visible
	public void moveto_additional_info() {
		actions.moveToElement(other_box);
		actions.perform();
	}
	//enter address
	public void address(String add) {
		add1.sendKeys(add);
	}

	//enter city
	public void city(String ct) {
		city.sendKeys(ct);
	}

	//select state
	public void state_drp(String st) {
		Select con=new Select(state);
		con.selectByValue(st);
	}

	//enter zipcode
	public void zip(String st) {
		zipcode.sendKeys(st);
	}
	//enter text in additional info box
	public void a_box(String text) {
		other_box.sendKeys(text);
	}	
	//scroll Down to element visible
	public void moveto_reg_btn() {
		actions.moveToElement(submit_Account);
		actions.perform();
	}
	//enter mobile number
	public void m_num(String num) {
		mobile_num.sendKeys(num);
	}
	//Submit form
	public void register() {
		submit_Account.click();
	}

	//login 
	public void login(String em,String pass) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",login );
		email.sendKeys(em);
		password.sendKeys(pass);
		//click login btn
		login.click();
	}

	//New Account creation
	public void newaccount() {
		signin.click();
		email.sendKeys(prop.getProperty("email"));
		createbtn.click();
		//move to lastname element
		actions.moveToElement(l_name_address);
		actions.perform();
		mr_btn.click();
		f_name.sendKeys(prop.getProperty("first_name"));
		l_name.sendKeys(prop.getProperty("last_name"));
		password.sendKeys(prop.getProperty("password"));
		//select Date of birth
		Select date=new Select(day);
		date.selectByValue("5");
		Select mnt=new Select(month);
		mnt.selectByValue("2");
		Select yr=new Select(year);
		yr.selectByValue("3");
		//check box1
		checkbox1.click();
		//check box2
		checkbox2.click();
		//address
		add1.sendKeys(prop.getProperty("address"));
		//city
		city.sendKeys(prop.getProperty("city"));
		//state
		Select con=new Select(state);
		con.selectByValue("5");
		//zipcode
		zipcode.sendKeys(prop.getProperty("zipcode"));
		//additional info
		other_box.sendKeys(prop.getProperty("additionalinfo"));
		//mobiile num
		mobile_num.sendKeys(prop.getProperty("mobilenumber"));
		//click Register btn
		submit_Account.click();
	}


}

