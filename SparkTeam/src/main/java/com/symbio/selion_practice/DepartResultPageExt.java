package com.symbio.selion_practice;

import com.paypal.selion.platform.html.Label;
import com.paypal.selion.testcomponents.DepartResultPage;

/**
 * /**
 * extends DepartResultPage for easier to use the object
 * @author he-cuishuang
 *
 */
public class DepartResultPageExt extends DepartResultPage {

	public void selectFlightShorterThan(int expectedHour) {

		for (int i = 0; i < this.getFlightContainer().size(); i++){
			System.out.println(2);
			String timeLabel = this.getFlightContainer(i).getTimeLabel().getText();
			System.out.println(timeLabel);
			int hour = Integer.valueOf(timeLabel.substring(0, timeLabel.indexOf("小"))
					.trim());
			if (hour < expectedHour) {
				this.getFlightContainer(i).getSelectButton().click();

				break;
			}
		}
	}

}
