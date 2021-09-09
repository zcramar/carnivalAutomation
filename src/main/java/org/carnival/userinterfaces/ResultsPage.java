package org.carnival.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsPage {

    public static final Target RESULT_GRID = Target.the("Result grid").locatedBy("//div[@class='vrcn-wrapper vrcn-wrapper--centered']");
    public static final Target RESULT_DAY_DURATION = Target.the("Duration of each result").locatedBy("//div[@class='vrl-item__destination']//span[@class='cgc-cruise-glance__duration-title-content ng-binding']");
    public static final Target RESULT_PRICE = Target.the("Price of each result").locatedBy("//li[@class='vrl-item__action']//span[@class='vrl-item__price-value ng-binding']");
    public static final Target PRICE_FILTER = Target.the("Price filter").located(By.id("sfn-nav-pricing"));
    public static final Target MIN_POINTER_PRICE_FILTER = Target.the("Min pointer price filter").locatedBy("//span[@class='rz-pointer rz-pointer-min']");
    public static final Target MAX_POINTER_PRICE_FILTER = Target.the("Max pointer price filter").locatedBy("//span[@class='rz-pointer rz-pointer-max']");
    public static final Target MIN_POINTER_PRICE_FILTER_VALUE = Target.the("Min pointer price filter value").locatedBy("//span[@class='rz-bubble']");
    public static final Target MAX_POINTER_PRICE_FILTER_VALUE = Target.the("Max pointer price filter value").locatedBy("(//span[@class='rz-bubble'])[2]");
}
