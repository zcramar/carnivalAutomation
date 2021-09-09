package org.carnival.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingPage {

    public static final Target COOKIE = Target.the("Cookies banner").located(By.id("cookie-consent-btn"));
    public static final Target DISCOUNT_OFFER = Target.the("Discount offer banner").locatedBy("//div[@class='vifp-no-thankyou']");
    public static final Target SAIL_TO = Target.the("Departure port").located(By.id("cdc-destinations"));
    public static final Target DESTINATION = Target.the("Destination Port").locatedBy("//button[@class='cdc-filter-button ng-binding' and contains(text(), 'Bahamas')]");
    public static final Target DURATION = Target.the("Duration field").located(By.id("cdc-durations"));
    public static final Target TIME_PERIOD = Target.the("Time period 6-9 days").locatedBy("//button[@class='cdc-filter-button ng-binding' and contains(text(), '6 - 9')] ");
    public static final Target SEARCH_BUTTON = Target.the("Search cruises button").locatedBy("//a[@class='cdc-filters-search-cta']");
}

