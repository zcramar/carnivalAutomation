package org.carnival.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.carnival.userinterfaces.ResultsPage.MAX_POINTER_PRICE_FILTER;
import static org.carnival.userinterfaces.ResultsPage.PRICE_FILTER;

public class ApplyPriceFilter implements Task {

    private WebDriver hisBrowser;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRICE_FILTER),
                WaitUntil.the(MAX_POINTER_PRICE_FILTER, isVisible()).forNoMoreThan(3).seconds());
    }

    public static ApplyPriceFilter priceFilter (WebDriver hisBrowser){
        return instrumented(ApplyPriceFilter.class, hisBrowser);
    }
}
