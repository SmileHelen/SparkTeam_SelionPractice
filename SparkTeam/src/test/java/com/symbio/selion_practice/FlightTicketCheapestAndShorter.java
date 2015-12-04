package com.symbio.selion_practice;

import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.testcomponents.DepartResultPage;
import com.paypal.selion.testcomponents.ViewFlightPage;

/**
 * cheapest flight and the flight is under 15 hours
 * 
 * @author he-cuishuang
 *
 */
public class FlightTicketCheapestAndShorter {
	HomePageExt homePageExt = new HomePageExt();
	DepartResultPageExt departResultPage = new DepartResultPageExt();
	Utility utility = new Utility();
	ViewFlightPage viewFlight = new ViewFlightPage();

	@DataProvider(name = "placeDataPovider")
	public Object[][] getplaceDataProvider() throws Exception {
		FileSystemResource resource = new FileSystemResource(
				"src/test/placeDataProvider.yaml");
		SeLionDataProvider dataProvider = DataProviderFactory
				.getDataProvider(resource);
		return dataProvider.getAllData();
	}

	/**
	 * the duration of the flight is under 15 hours
	 * 
	 * @param testData
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "placeDataPovider")
	@WebTest
	public void flighTicket1(LinkedHashMap<Object, Object> testData)
			throws InterruptedException {
		String s1 = (String) testData.get("startPlace");
		String s2 = (String) testData.get("endPlace");
		homePageExt.oneWayticket(s1, s2);

		// select the flight is under 15 hours
		departResultPage.selectFlightShorterThan(15);

		// switch to the view page
		Utility.existedHandles.add(Grid.driver().getWindowHandle());
		String handle = utility.switchToNewWindow(Grid.driver());
		Grid.driver().switchTo().window(handle);

		// check view is shown
		WebDriverWaitUtils.waitUntilElementIsPresent(viewFlight.getViewLabel()
				.getLocator());
	}
}
