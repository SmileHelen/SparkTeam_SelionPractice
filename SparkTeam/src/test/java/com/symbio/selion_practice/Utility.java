package com.symbio.selion_practice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
  * Utility class for making things easier
  * @author Bruce
  */

public class Utility {
	
	public static List<String> existedHandles = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility helper = new Utility();
		
		System.out.println(helper.formatDate(helper.getDepartMonday()));
		System.out.println(helper.formatDate(helper.getReturnMonday()));
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		return dateFormat.format(date);
	}
	
	public Date getDepartMonday(){
		  Date today = new Date();
		  Calendar ca = Calendar.getInstance();
		  ca.setTime(today);
		  ca.get(Calendar.WEEK_OF_YEAR);
		  ca.set(Calendar.WEEK_OF_YEAR,  ca.get(Calendar.WEEK_OF_YEAR)+1);
		  ca.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		  return ca.getTime();
		 }
	
	
	
	public Date getReturnMonday() {
		  Date departDate = getDepartMonday();
		  Calendar ca = Calendar.getInstance();
		  ca.setTime(departDate);
		  ca.get(Calendar.WEEK_OF_YEAR);
		  ca.set(Calendar.WEEK_OF_YEAR,  ca.get(Calendar.WEEK_OF_YEAR)+3);
		  ca.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		  return ca.getTime();
	}
	
	// ensure the page present
	public void waitPageToPresent(final WebDriver driver, final List<String> existedHandles) {

		final int existedSize = existedHandles.size();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub	
				
				int size = driver.getWindowHandles().size();
				if (size > existedSize) {
					return true;
				} else {
					return false;
				}
			}
		});

	}
	
	// switch to the new window
	public String switchToNewWindow(WebDriver driver) {
		Set<String> handleSet = driver.getWindowHandles();

//		waitPageToPresent(driver, existedHandles);

		for (String handle : handleSet) {
			if (!existedHandles.contains(handle)) {
				driver.switchTo().window(handle);
				return handle;
			}
		}

		return null;

	}

}
