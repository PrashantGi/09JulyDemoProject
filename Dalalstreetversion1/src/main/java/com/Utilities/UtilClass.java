package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass() 
	{
		PageFactory.initElements(driver, this);
	}
	 static String path="C:\\Users\\Pankaj\\eclipse-workspace\\dalalstreetFramework01\\ScreenShot\\";
	 public static void takeScreenShot(String filename)
		{
			try 
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				File des = new File(path+filename+".png");
				FileHandler.copy(src, des);
			} 
			catch (IOException e) 
			{
				System.out.println("Please provide correct path");
				e.printStackTrace();
			}	
	}
	
	
}
