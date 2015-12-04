package com.symbio.selion_practice;

import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.testcomponents.DepartResultPage;
import com.paypal.selion.testcomponents.ViewFlightPage;
import com.symbio.selion_practice.HomePageExt;

/**
 *select the cheapest flight.
 * @author he-cuishuang
 *
 */
public class FlightTicketCheapest {
	HomePageExt homePageExt = new HomePageExt();
	DepartResultPage departResultPage = new DepartResultPage();
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
	 * select the cheapest flight.
	 * @param testData
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "placeDataPovider")
	@WebTest
	public void flighTicket2(LinkedHashMap<Object, Object> testData)
			throws InterruptedException {
		String s1 = (String) testData.get("startPlace");
		String s2 = (String) testData.get("endPlace");
		homePageExt.oneWayticket(s1, s2);

		// click the first flight wich is cheapest;
		WebDriverWaitUtils.waitUntilElementIsPresent(departResultPage
				.getDefaultSelectButton().getLocator());
		departResultPage.getDefaultSelectButton().click();

		// check view is shown
		WebDriverWaitUtils.waitUntilElementIsPresent(viewFlight.getViewLabel()
				.getLocator());
		Thread.sleep(5000);
	}
}
