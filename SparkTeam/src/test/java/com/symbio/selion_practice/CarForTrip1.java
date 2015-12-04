package com.symbio.selion_practice;

import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;

public class CarForTrip1 {
	CarForTripExt carForTrip = new CarForTripExt();
	@DataProvider(name = "placeDataPovider")
	public Object[][] getplaceDataProvider() throws Exception {
		FileSystemResource resource = new FileSystemResource(
				"src/test/placeDataProvider.yaml");
		SeLionDataProvider dataProvider = DataProviderFactory
				.getDataProvider(resource);
		return dataProvider.getAllData();
	}
	
	@Test(dataProvider = "placeDataPovider")
	@WebTest
	public void cheapestCar (LinkedHashMap<Object, Object> testData){
		String startPlace = (String) testData.get("startPlace");
		carForTrip.carOfCheapest(startPlace);
		
	}
}
