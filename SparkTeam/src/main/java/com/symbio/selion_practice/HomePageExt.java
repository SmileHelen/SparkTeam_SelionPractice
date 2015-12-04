package com.symbio.selion_practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.testcomponents.HomePage;

/**
 * extends HomePage for easier to use the object
 * @author he-cuishuang
 *
 */
public class HomePageExt extends HomePage{
	HomePage homePage = new HomePage();
/**
 * Select the one way to buy fight ticket
 * @param startPoint 
 * @param endPoint
 * @throws InterruptedException
 */
	@Test
	@WebTest
	public void oneWayticket(String startPoint, String endPoint)
			throws InterruptedException {
		// Launch the expedia.com URL in the browse
		Grid.driver().get("https://www.expedia.com.hk");

		// set to flight label
		homePage.getFlightLabel().click();

		// set to the one way label
		homePage.getOneWayLabel().click();

		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getStartTextField().getLocator());

		// input the start place
		homePage.getStartTextField().type(startPoint);
		
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getStartList().getLocator());

		// select the airport
		homePage.getStartList().click();
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getDestinationTextField().getLocator());
		
		// input the end point
		homePage.getDestinationTextField().type(endPoint);
		

		// select the end airpot
		homePage.getStartList().click();

		// input the leave time
		homePage.getTimeDepartTextField().type(getNextMonday());

		// click the background
		homePage.getBlackLabel().click();
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getSearchButton().getLocator());
		
		// click the search button
		homePage.getSearchButton().click();

	}

	/**
	 * Select the returnWay to buy flight ticket
	 * @param startPoint: select the start place
	 * @param endPoint: select the end place
	 * @throws InterruptedException
	 */
	public void returnWayTicket(String startPoint, String endPoint)
			throws InterruptedException {
		// Launch the expedia.com URL in the browse
		Grid.driver().get("https://www.expedia.com.hk");
		
		
		// set to flight label
		homePage.getFlightLabel().click();
		
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getReturnLabel().getLocator());

		// set to the returning way label
		homePage.getReturnLabel().click();

		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getStartTextField().getLocator());

		// input the start place
		homePage.getStartTextField().type(startPoint);
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getStartList().getLocator());

		// select the airport
		homePage.getStartList().click();
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getDestinationTextField().getLocator());
		
		// input the end point
		homePage.getDestinationTextField().type(endPoint);
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getStartList().getLocator());

		// select the end airpot
		homePage.getStartList().click();
		WebDriverWaitUtils.waitUntilElementIsPresent(homePage.getTimeDepartTextField().getLocator());
		
		// input the leave time
		homePage.getTimeDepartTextField().type(getNextMonday());
				
		//input the back time
		homePage.getTimeReturnTextField().type(getMondayAfterThreeWeek(getNextMonday()));

		// click the search button
		homePage.getSearchButton().click();

	}
	
	/**
	 * get the next Monday time
	 * @return the next Monday as a string
	 */
	public String getNextMonday() {
		Date today = new Date();
		Calendar ca = Calendar.getInstance();
		ca.setTime(today);
		ca.set(Calendar.WEEK_OF_YEAR, ca.get(Calendar.WEEK_OF_YEAR) + 1);
		ca.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return new SimpleDateFormat("yyyy/MM/dd").format(ca.getTime());
	}
	
	/**
	 * get the Monday after three weeks
	 * @return the Monday after three weeks as a string
	 */
	public String getMondayAfterThreeWeek(String nextMonday) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Calendar ca = Calendar.getInstance();
		try {
			ca.setTime(sdf.parse(nextMonday));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ca.set(Calendar.DAY_OF_YEAR, (ca.get(Calendar.DAY_OF_YEAR) + 21));
		return new SimpleDateFormat("yyyy/MM/dd").format(ca.getTime());
	}
	
}
