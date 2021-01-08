package com.pages.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.facebook.AutoConstant;
import com.generics.facebook.BasePage;
import com.generics.facebook.ExcelLibrary;

public class FacebookFrameworkPage extends BasePage implements AutoConstant
{
	@FindBy(xpath="//a[@class='_8esh']")
	private WebElement createpageLink;
	
	@FindBy(xpath="//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")
	private WebElement signupButton;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement surnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement mobileTextfield;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement birthDate;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement birthMonth;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement birthYear;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement femaleRadiobutton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement maleRadiobutton;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement customRadiobutton;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submitButton;
	
	public FacebookFrameworkPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submitDetails() throws IOException 
	{
		createpageLink.click();
		signupButton.click();
		firstnameTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name1, 1 , 0));
		surnameTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name1, 1, 1));
		mobileTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name1, 1, 2));
		passwordTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name1, 1, 3));
		selectbyvisibletext(birthDate, "15");
		selectbyvisibletext(birthMonth, "Aug");
		selectbyvisibletext(birthYear, "1991");
		femaleRadiobutton.click();
		submitButton.click();
	}

}
