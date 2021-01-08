package com.scripts.facebook;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.facebook.BaseTest;
import com.pages.facebook.FacebookFrameworkPage;

public class FacebookFrameworkTest extends BaseTest
{
	@Test
	public void submitMethod() throws IOException 
	{
		FacebookFrameworkPage facebook=new FacebookFrameworkPage(driver);
		facebook.submitDetails();
	}

}
